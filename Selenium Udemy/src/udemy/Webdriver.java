package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		driver.get("https://gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		String check = driver.getTitle();
		if (check.contains("Gmail"))
		{
			System.out.println("Landed in correct page");
		driver.close();
		}
		else
		{
			System.out.println("Wrong page");
		}
	}

}
