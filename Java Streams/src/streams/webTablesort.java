package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTablesort {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		driver.manage().window().maximize();
		// we are getting the list of items from the table and check it with the sorted list
		
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));// here collecting the webelements and converted into list
		
		List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());// here we are getting the text of the webelement and storing in the list using collectors
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());// here we are sorting the original list
		
		Assert.assertTrue(originalList.equals(sortedList));// here we are checking the original list and sorted list
		
		// next we are going to get the price of the particular item
		
		//for that
		//scan the name column with getText and -> Beans and print the price of the Beans
		
		List<String> price = elements.stream().filter(s->s.getText().contains("Beans")).map(s->getpriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a)); // we are printing the price finally
		// above method explanation
		// we are taking the "elements" list which we got from line 23
		// we are converting it to stream
		// from that stream we are getting only the element containing text "Beans"
		// now the stream contain only the webelement of "Beans"
		// now i am creating a method of my own "getpiceVeggie" carrying webelement as argument which will be declared at the end where we will write the code
		// to move to the next column of the corresponding row and catch the price
		// after moving using collect we are collecting the price of the Beans using "collect" method
		
	}

	private static String getpriceVeggie(WebElement s) { // here we are writing this method to catch the price of the Beans which is given in the next column
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText(); // here we are finding using xpath
		// the actual full xpath is "//tr/td[1]/following-sibling::td[1]" 
		// "//tr/td[1]" - actually we are in this element ...so we need to find the sibling only...so we are giving xpath of sibling only
		// getting the text of that element and storing in the string pricevalue
		return pricevalue; //returning the pricevalue
	}
	
	// in the above method we are finding the price of beans... since beans is in the first page we are able to do easily
	// what if we want to find the price of some other item and it is not present in the first page
	// for that we need to move to each and every page and find the particular item and get its price
	// there comes the concept pagination
	
	

}
