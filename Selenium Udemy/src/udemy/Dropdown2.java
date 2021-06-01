package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//https://rahulshettyacademy.com/dropdownsPractise/ 
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				
				int i=1;
				while(i<5)
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
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
	}
}
