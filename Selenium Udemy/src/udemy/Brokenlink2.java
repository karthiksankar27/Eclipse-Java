package udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlink2 {

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
			Assert.assertTrue(respcode<400, "The link with the text"+" "+link.getText()+"is broken with response code"+" " +respcode);
			// the above line avoid if condition if the response is 401 --- 401<400 false ---true(false)--- this will quit--- but this wont quit all of sudden
			// this will store and then finally it will put using assertall
			
			/*if(respcode>400)
			{
				System.out.println("The link with the text"+" "+link.getText()+"is broken with response code"+" " +respcode);
				Assert.assertTrue(false); 
				//these are hard assertions this has checked only till broken link and failed the test case // it didnt check the remaining links 
				// so we need soft assertions ---- which will check all the links and will tell the broken link after checking all the links
			}*/
	}
		a.assertAll();//this is to report the failures if this has any failures it will fail the script -- if it didnt have any failure it will pass the script


	}
	}

