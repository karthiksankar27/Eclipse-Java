package udemy;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentwaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
				
				public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
	}
	});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());*/ 
		// --------  This method gave the output false saying that Hello world is not found... Actually fluent wait should wait for 30 seconds
		// in the interval of 3seconds to check the element... but it came out of the loop soon and dsplayed false
		// because the cssSelector we gave is static and not dynamic because it is present always but it is not displayed
		// that is why the fluent wait in the starting itself found the element and print false because it is not visible
		// we need to tell the method that element is present and wait till the element is visible
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
				
				public WebElement apply(WebDriver driver) {
					if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) // here we are asking the driver to check if the element is displayed  
					{           															 // else it will return null and again the driver checks for next 3 secs
						return driver.findElement(By.cssSelector("[id='finish'] h4"));		// then if the element found it will return.. because we are expecting webelement to return in this method
					}
					else
						return null;
	}
	});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
	}
	

}
