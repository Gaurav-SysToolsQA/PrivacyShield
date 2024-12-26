package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjetcts.BasePage;

public class Roles extends BasePage
{

	public Roles(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//i[@id='CreateButton']")
	WebElement AddRole;

	public void AddRoles() throws InterruptedException
	{
		AddRole.click();
		Thread.sleep(2000);
	}
	
}
