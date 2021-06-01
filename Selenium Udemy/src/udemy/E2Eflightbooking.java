package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2Eflightbooking {
	
	public static void main (String[] args) throws InterruptedException
	{
		//https://rahulshettyacademy.com/dropdownsPractise/ 
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				driver.findElement(By.id("autosuggest")).sendKeys("ind");
				Thread.sleep(3000);
				List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
				
				for(WebElement option : options)
				{
					if(option.getText().equalsIgnoreCase("India"))
					{
						option.click();
						break;
						
					}
				}
				
				System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
				System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				
				driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
				driver.findElement(By.xpath("//a[@value='MAA']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector(".book")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.id("divpaxinfo")).click();
				
				Thread.sleep(2000);
				int i=1;
				while(i<3)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
				
				int j=1;
				while(j<3)
				{
					driver.findElement(By.id("hrefIncChd")).click();
					j++;
				}
				
				driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
				
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
				
				System.out.println("Flight ticket for Chennai to Pune booked successfully");
				
				driver.close();
					
	
	}

}
