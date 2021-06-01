package udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> window =driver.getWindowHandles(); // this set will get the id's of the window opened by automation [parentid,childid] ----if we have opened 3 windows then [parentid,childid,subchildid]
		Iterator<String> it =window.iterator(); // we are creating the iterator to get the id's --- this will help to move to next window
		String parentId = it.next(); //first we get the parent id
		String childId = it.next(); // then we get the child id
		driver.switchTo().window(childId); // we are now switching to child window from the parent window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		// we will get "Please email us at mentor@rahulshettyacademy.com with below template to receive response"
		//from this we have to extract the email id alone for that writing code below
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		// what we do in the above step
		// we are getting the text first
		// we are splitting the text into 2 using the word 'at' so this split will create an array and save like this {Please email us, mentor@rahulshettyacademy.com with below template to receive response}
		// we are asking the element in the index [1] to be considered -- so it will consider ' mentor@rahulshettyacademy.com with below template to receive response'
		// there is a space in the front of email id... so we are trimming that... after trimming 'mentor@rahulshettyacademy.com with below template to receive response'
		// now we are splitting using the gap " "... after splitting [mentor@rahulshettyacademy.com,with below template to receive response]
		// we are asking the element in the index [0] to be considered and we got the email id
		
		
		driver.switchTo().window(parentId); // from child window we are moving to parent window
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
		

	}

}
