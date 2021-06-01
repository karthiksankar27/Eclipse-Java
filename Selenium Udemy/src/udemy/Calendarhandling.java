package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		//WebDriver.Timeouts(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".form-control.or-src-city")).click();
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ig-input-group'] //div[@class='wrap'] //div[contains(text(),'MAA')])[2]")).click();
		
		//driver.findElement(By.xpath("//input[@class='form-control or-depart igInitCalendar']")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		//*[@id="roundTrip"]
	}

}
