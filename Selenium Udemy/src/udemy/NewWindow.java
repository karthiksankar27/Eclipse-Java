package udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scenario : 
		// Navigate to https://rahulshettyacademy.com/angularpractice/ 
		// Fill the "Name" field with the first course name available at "https://rahulshettyacademy.com"

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB); // we are telling the driver to open new TAB
		// the above line is not wprking here.. so created new project Selenium4.0 with new package selenium4 and with Class NewWindow
		// and imported the selenium 4.0 alpha 4 version
		// it works fine there
		Set<String> handles = driver.getWindowHandles(); // we are getting the window handles to make the driver to move to next window or tab
		// this is same as window handling concept
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId); // here we are moving to child window and then getting the link
		driver.get("https://rahulshettyacademy.com");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		// in the above line we are trying to get the generalized css for the first course name
		// because the first course name may change... it wont be static
		// so we took the regular expression till /p
		// and this is in the index [1]  and not in index [0]
		// so we are getting from the index[1] adn getting the text of it
		
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(courseName);
		
		
		
		
		
		
		
		
	}

}
