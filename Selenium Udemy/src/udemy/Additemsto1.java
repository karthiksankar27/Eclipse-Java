package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Additemsto1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// https://rahulshettyacademy.com/seleniumPractise/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// here created implicit wait , this implicit wait will be global and it will act for each line of the program
		driver.manage().window().maximize();
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot","Beans","Mushroom"}; // this array is for collecting the vegetables needed
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded); // we can call the method of a class without object itself make sure that the method is static
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		// next step promocode appears slowly so we use explicit wait... this explicit wait will impact this step only
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		


	}



public static void addItems(WebDriver driver, String[] itemsNeeded)
{
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	// we will convert this array into arraylist for easy search
	// then we will check whether the name extracted is present in arraylist or not
	
	//List itemsNeededlist= Arrays.asList(itemsNeeded);
	int j=0;
	
	for(int i=0;i<products.size();i++)
	{
		
		// Brocolli - 1 Kg
		// Brocolli   1 Kg
		
		String[] name = products.get(i).getText().split("-"); // this we are splitting Brocolli and 1 Kg , it will save in name[0] and name[1]
		String formattedName = name[0].trim(); // here we are trimming the spaces in the name
		
		
		List<String> itemsNeededlist= Arrays.asList(itemsNeeded);// this is to convert array to arraylist
		
		
		if(itemsNeededlist.contains(formattedName))
		{
			j++;
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();---- this we used and worked fine..but this text is inconsistent so using next
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			// here ADD TO CART will be present at many places here we are trying to get the particular index by get(i) and then clicking it
			//break; use break if you are finding one element , if we use break when we check for the list needed it will come out if one is found
			
			//Thread.sleep(4000); // i have used this because when one item is clicked add to cart it changed to added and so the next item doesnt consider that.
			//so i used wait to consider that.... instead using this we can change the xpath also because 'ADD TO CART' is inconsistent and we use the classname
			if(j==itemsNeeded.length)
				break;
		}
	}
}
}
