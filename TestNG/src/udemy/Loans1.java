package udemy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loans1 {
	
	@BeforeClass
	public void  ClassBefore()
	{
		System.out.println("I am before the class");
	}

	@AfterClass
	public void ClassAfter()
	{
		System.out.println("I am after the class");
	}
	@Test(timeOut=4000) // This timeout is used to make the test case which will take long time to execute
	public void webLoginhomeLoan()
	{
		System.out.println("Webloginhome");
	}
	
	@Test(enabled=false) // This enabled false method will help to skip the test , if we put true it will be turned ON
	public void MobileLoginhomeLoan()
	{
		System.out.println("Mobileloginhome");
	}
	
	@Test(dependsOnMethods= {"WebLoginhomeLoan"}) //This will help to execute the WebLoginhomeLoan method first 
	public void APIhome()
	{
		System.out.println("API home");
	}
	
	@Test
	public void APIsignin()
	{
		System.out.println("API sigin");
	}
	
	@Test(groups= {"Smoke"})
	public void APIlogoff()
	{
		System.out.println("API logoff");
	}
	
	@AfterSuite
	public void last()
	{
		System.out.println("I am the overall last");
	}
	
	@BeforeMethod
	public void MethodBefore()
	{
		System.out.println("I am before every method of my own class");
	}
	
	@AfterMethod
	public void MethodAfter()
	{
		System.out.println("I am after every method of my own class");
	}
}
