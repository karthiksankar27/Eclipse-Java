package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		// Moves to specific element
				a.moveToElement(move).build().perform(); // we are building and performing--so it executes
		
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//what we do above is -- selecting the element - clicking - pressing Shift key in keyboard - sending hello to print in caps 
		
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Send").doubleClick().build().perform();
		// here we are just selecting the text entered in the box-- just double click will select the text entered in the box
		
		a.moveToElement(move).contextClick().build().perform();
		
		
	}

}
