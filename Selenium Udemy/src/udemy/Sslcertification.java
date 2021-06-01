package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslcertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// there are insecure certifications and ssl certifications
		
		
		// we are creating the object to accept certifications
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts(); // this object now has the capability to accept the insecure certifications--- then we are passing this object to chromeoptions
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		// now we are making our chrome as we desire
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		// DesiredCapabilites and Chrome options classes are different they both are made conjuctively to help accept certifications
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver(c); // here we are passing the object c
		driver.get(" " );
		

	}

}
