package udemy;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Loans {

	@Test
	public void webLogincarLoan()
	{
		System.out.println("WebloginCar");
	}
	
	@Test
	public void MobileLogincarLoan()
	{
		System.out.println("MobileloginCar");
	}
	
	@Test
	public void MobilesignincarLoan()
	{
		System.out.println("MobileloginCar");
	}
	@Test
	public void MobileshowcarLoan()
	{
		System.out.println("MobileloginCar");
	}
	
	@Test(groups= {"Smoke"})
	public void APIcar()
	{
		System.out.println("API Car");
	}
	
	@BeforeSuite
	public void first()
	{
		System.out.println("I am the overall number 1");
	}
	
	
	
}
