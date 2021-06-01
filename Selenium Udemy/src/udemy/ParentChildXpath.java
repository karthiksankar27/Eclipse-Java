package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXpath {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Enter");
	//driver.findElement(By.xpath("//div[@class='L3eUgb']/div[3]/div/div/div/div[3]/input")).click();  ---- didn't got output for this
	 
	
}
}
