package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterwebTable {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// what we are going to do here is 
		// we are going to type the name of the item needed in the box..say Rice
		// now it will show all the items with name Rice... say Black rice, white rice, brown rice
		// we get the list and check whether all the items in the list contains name "Rice" in it
		// if both the list are equal test case passed
		
		driver.findElement(By.id("search-field")).sendKeys("Rice"); // we are typing "Rice" in box
		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));// now we are getting all the items webelement from column1
		
		List<WebElement> filteredList = items.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		// in the above line ... i am converting the "items" list to streams.
		// i am filtering... i am checking each item contains the name "Rice" in it
		// collecting those webelements and maintaining in the list "filteredList"
		
		//now if size of both list "items" and "filteredList" are equal ...test case is passed
		Assert.assertEquals(items.size(), filteredList.size());
		
		
		
		
		
	}

}
