package udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// broken url
		// we will get all the links in the page and then we will check their status code --- status code should be 200 or 300 ,but not 400
		// Java method help to get the status code
		// Step 1 - we will get all links using selenium
		// step 2 - we will use java methods to call that url and get the status code
		// If status codes are greater than 400 are broken
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href"); // this will help to get the url 
		
		// there is a method called openConnection() which comes from url class
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection(); // here creating object for the class URL and calling the method openConnection present in it
		
		conn.setRequestMethod("HEAD"); // we are making a call to the URL using Head request method
		conn.connect(); // this will make the url to open
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		 // the above written lines will help you to get whether the link is working or not with opening the link
}
}
