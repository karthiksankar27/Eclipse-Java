package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// to scroll down the page we need javascript
		// so we are using javascript executor class
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // casting driver with Javascript executor so that out=r driver will be able to perform javascript methods
			
		js.executeScript("window.scrollBy(0,500)"); // here scrolling the window // that command can be checked in console
		
		Thread.sleep(2000);
		//scrolling within table
		// for scrolling the table we are getting the classname of the table first ad then we are scrolling--- scrollTop moves the rows up
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); 

		List<WebElement> values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); // here collecting the elements from the fourth column of the table
		// first table classname and then the child ... use table classname because driver may select another table 4th column
		
		int sum=0;
		for(int i=0; i<values.size();i++)
			
		{
			sum = sum + Integer.parseInt(values.get(i).getText()); // here converting the strings to the int, so with the help of int only we can add and then summing it
		}
		System.out.println(sum);
		
		driver.findElement(By.cssSelector(".totalAmount")).getText(); // getting the total amount from the page
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());// splitting and trimming the element to get 296 and then converting it to int from string
	
		Assert.assertEquals(sum, total);// using assertion to check whether both are equal
		
	}

}
