package udemy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Give the count of links in the page
		
		// link will have the tagname a
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Give the count of links present in the footer section
		
		WebElement footerdriver= driver.findElement(By.id("navFooter"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// Give the count of the links present in the first column of the footer
		
		WebElement columndriver = footerdriver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		int size = columndriver.findElements(By.tagName("a")).size();
		
		List<WebElement> elements = columndriver.findElements(By.tagName("a"));
		
		
		for(int i=0;i<size; i++)
		{
			
			System.out.println(elements.get(i).getText());
			
		}
		
		// Open the four different pages present in this links
		
		String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for(int j=0;j<size;j++)
		{
			elements.get(j).sendKeys(clickonlink);
		}
		
			Thread.sleep(5000);
			 // now trying to get the titles of the pages opened
			Set<String> tabs =driver.getWindowHandles(); 
			Iterator<String> it = tabs.iterator();
			
			while(it.hasNext()) // if it has next it will increment // has next tells whether next index is present or not
			{
				System.out.println(driver.switchTo().window(it.next()).getTitle()); // next tells to move to the next 
				
			}
		

	}

}
