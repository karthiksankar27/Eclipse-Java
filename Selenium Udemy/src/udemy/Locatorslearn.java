package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorslearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("karthiksdkd");
		driver.findElement(By.name("pass")).sendKeys("karsalwayswantstolearn");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Karthik");
		driver.findElement(By.name("pw")).sendKeys("122345");
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
	    System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		driver.close();

	}

}
