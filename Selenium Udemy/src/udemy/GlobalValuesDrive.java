package udemy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties(); // creating object for the properties
		FileInputStream fis=new FileInputStream("C:\\Users\\Karthik\\eclipse-workspace\\Selenium Udemy\\src\\udemy\\data.properties"); // here providing the path of the data.properties file
		prop.load(fis); // here we are telling to read the file
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println((prop.setProperty("browser", "firefox")));
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\Karthik\\\\eclipse-workspace\\\\Selenium Udemy\\\\src\\\\udemy\\\\data.properties");
		prop.store(fos, null);// here we are telling to write the file
	}

}
