package udemy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test1 {

	// TODO Auto-generated method stub
	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	
	@Parameters({"URL"}) // here i am using the parameter which was passed globally in the testng4.xml file and getting in the method in the form of urlname String
	@Test
	public void now(String urlname)
	{
		System.out.println("Hello");
		System.out.println(urlname);
	}

	@AfterTest
	public void end()
	{
		System.out.println("I will come out last");
	}
}
