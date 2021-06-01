package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iFrame")).size()); // this will give the number of frames present in the page
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame"))); // here we have used the webelement to find frame --- frame(webelement) --- 
		// we can also find by index and id -- frame(int) { first frame will be in 0 index} --- frame(String) { if we get to know id we will put that }
		driver.findElement(By.id("draggable")).click();
		
		// now we are moving to drag and drop
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();// this is important -- because after finshing the work in frame and we need to click anything outside the frame
		// we need to tell the driver to switch to the page from the frame
	}

}
