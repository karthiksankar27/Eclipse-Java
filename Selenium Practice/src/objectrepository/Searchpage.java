package objectrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {

	WebDriver driver;
	
	public Searchpage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//div[@class='a4bIc']/input")
	WebElement searchbar;
	
	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	WebElement search;
	
	@FindBy(how=How.XPATH,using="//div[@class='aajZCb']")
	private List<WebElement> dropdown;
	
	public WebElement Searchbox()
	{
		return searchbar;
	}
	
	public WebElement Entertext()
	{
		return search;
	}
	
	public WebElement dropdownbox()
	{
		WebElement selected = null;
		for(WebElement select : dropdown)
		{
			 if(select.getText().contains("india"))
			 {
				 selected = select;
			 }
		}
		return selected;
		
	}
	
	
	
	}

