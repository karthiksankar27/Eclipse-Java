package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffloginPagePF {
	
	WebDriver driver; // here we have defined a driver, but this driver has no knowledge about which driver to execute... for that we should call from testcase
	//for that we are defining the constructor here
	
	public RediffloginPagePF(WebDriver driver)
	{
		this.driver=driver;//"this.driver" represents the local driver and the "driver" refers to which comes from testcase class
		PageFactory.initElements(driver, this);// we have to provide this in the constructot to use PageFactory method
	}
	
	/*By username = By.id("login1");
	By password = By.id("password");
	By go = By.name("proceed");
	By home=By.className("f12");*/
	
	// here we are using Page factory instead of those above lines
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(className="f12")
	WebElement home;
	
	
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Signin()
	{
		return go;
	}
	
	public WebElement Home()
	{
		return home;
	}
	

}
