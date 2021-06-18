package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffhomePage {
	
	WebDriver driver; // here we have defined a driver, but this driver has no knowledge about which driver to execute... for that we should call from testcase
	//for that we are defining the constructor here
	
	public RediffhomePage(WebDriver driver)
	{
		this.driver=driver; //"this.driver" represents the local driver and the "driver" refers to which comes from testcase class
	}
	
	
	
	By Search = By.id("srchword");
	By go = By.className("newsrchbtn");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	
	public WebElement Go()
	{
		return driver.findElement(go);
	}

}
