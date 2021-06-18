package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.Searchpage;

public class GooglepageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		Searchpage sp = new Searchpage(driver);
		sp.Searchbox().click();
		sp.Entertext().sendKeys("ind");
		sp.dropdownbox().click();

	}

}
