package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffloginPage {
	
	WebDriver driver; // here we have defined a driver, but this driver has no knowledge about which driver to execute... for that we should call from testcase
	//for that we are defining the constructor here
	
	public RediffloginPage(WebDriver driver)
	{
		this.driver=driver; //"this.driver" represents the local driver and the "driver" refers to which comes from testcase class
	}
	
	By username = By.id("login1");
	By password = By.id("password");
	By go = By.name("proceed");
	By home=By.className("f12");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Signin()
	{
		return driver.findElement(go);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	

}
