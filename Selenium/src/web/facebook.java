package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//driver.findElement(By.id("email")).sendKeys("karthiksd");
		//driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Karthikeyan");
		driver.findElement(By.name("reg_email__")).sendKeys("7700880022");
		driver.findElement(By.xpath("//select[@id=\"day\"]/option[28]")).click();
		driver.findElement(By.xpath("//select[@id=\"month\"]/option[12]")).click();
		driver.findElement(By.xpath("//select[@id=\"year\"]/option[28]")).click();
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

		Thread.sleep(4000);
		driver.quit();
		
	}

}
