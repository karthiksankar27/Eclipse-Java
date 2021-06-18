package udemy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	
	@Parameters({"URL","APIKey/username"})
	@Test(groups= {"Smoke"})
	public void testing(String urlname, String key) {
		System.out.println("Testing in progress for test2");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	@Test(dataProvider="getData") // here i am passing the method of the data provider to the test so that invokes the data from it
	public void usingData(String username,String password)
	{
		System.out.println("Showing Data");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination - username password - good credit history
		// 2nd combination - username password - no credit history
		// 3rd combination - username password - fraudulent history
		
		Object[][] data = new Object[3][2]; // here row - combinations , column - values(username,password)
		
		//1st set
		data[0][0]= "firstusername";
		data[0][1]="firstpassword";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		
		data[2][0]="thridusername";
		data[2][1]="thirdpassword";
		return data;
		// this set will be called one by one by the method
		// we can run this class separately, but we will get error because the ablove method gets the parameters from xml file, so running from xml file
		
		
	}

}
