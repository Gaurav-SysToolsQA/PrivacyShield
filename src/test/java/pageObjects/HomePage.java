package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjetcts.BasePage;

public class HomePage extends BasePage 
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//img[@alt='Company Logo']")
	WebElement CompanyLogo;
	
	//boolean LogoDisplayed = false;
	public void Logo()
	{
		if(CompanyLogo.isDisplayed())
		{
			System.out.println("Login Successful! Logo is visible.");
		}
		else 
		{
		    System.out.println("Login Failed! Logo not found.");
		}
}
}
