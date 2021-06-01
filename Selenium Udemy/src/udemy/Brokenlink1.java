package udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlink1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links= driver.findElements(By.cssSelector(("li[class='gf-li'] a")));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection conn  = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			
			
			if(respcode>400)
			{
				System.out.println("The link with the text"+" "+link.getText()+"is broken with response code"+" " +respcode);
				Assert.assertTrue(false); 
				//these are hard assertions this has checked only till broken link and failed the test case // it didnt check the remaining links 
				// so we need soft assertions ---- which will check all the links and will tell the broken link after checking all the links
			}
	}


	}
	}
