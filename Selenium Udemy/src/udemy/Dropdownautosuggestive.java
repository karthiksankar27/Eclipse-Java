package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownautosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//https://rahulshettyacademy.com/dropdownsPractise/ 
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.id("autosuggest")).sendKeys("ind");
				Thread.sleep(3000);
				List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 
				// here we are writing the general path for getting the list options and the output will be in the form of WebElement options
				
				for(WebElement option : options) // here getting option one by one and moving into the loop
				{
					if(option.getText().equalsIgnoreCase("India")) // here verifying with the required option
					{
						option.click();  // here we are clicking the required option and breaking out of the loop
						break;
					}
				}
	}

}
