package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This assertion is brought by TestNG framework so u need to download testng jar files from Maven repository
		
		//https://rahulshettyacademy.com/dropdownsPractise/ 
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());// this method expects false .... if it is false as expected then it will pass to next step
				//if it comes true then it fails
				//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
				Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				// this method expect true and if true is returned it will pass to next step or else it will fail the test case
				//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				
				System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
