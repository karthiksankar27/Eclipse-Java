package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendargeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://path2usa.com/travel-companions");
		
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		
		// the below one is for month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("June")) // this loop is to click next button for the required month
		{
			 driver.findElement(By.className("next")).click();
		}
		
		
		
		
		
		// the below code is completely for selecting the date
		
		List<WebElement> dates=driver.findElements(By.className("day"));
	
		
	int size =driver.findElements(By.className("day")).size();
	
	for(int i=0;i<size;i++)
		
	{
		
		String text = driver.findElements(By.className("day")).get(i).getText();
		
		if(text.equalsIgnoreCase("25"))
		{
			driver.findElements(By.className("day")).get(i).click();
			
		}
	}
		

	}

}
