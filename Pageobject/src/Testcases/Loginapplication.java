package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.RediffhomePage;
import Objectrepository.RediffloginPage;

public class Loginapplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		RediffloginPage rd = new RediffloginPage(driver);// we are creating this object to access the methods of the
															// RediffloginPage class
		// driver is the argument we are passing and so the constructor in the
		// respective class also should have the same argument
		// we are passing the testcase driver as a argument to the repository class
		rd.EmailId().sendKeys("kars123");
		rd.Password().sendKeys("karsalways");
		rd.Signin().click();
		rd.Home().click();
		
		RediffhomePage rh = new RediffhomePage(driver);
		rh.Search().sendKeys("Values");
		rh.Go().click();
	}

}
