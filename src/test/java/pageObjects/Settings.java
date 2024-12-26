package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjetcts.BasePage;

public class Settings extends BasePage
{

	public Settings(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[contains(text(),'Settings')]")
	WebElement Settings;
	
	@FindBy(xpath = "//div[contains(text(),'Domain')]")
	WebElement Domain;
	
	@FindBy(xpath = "//div[@class='v-list-item__content mx-n5'][normalize-space()='Groups']")
	WebElement Groups;
	
	@FindBy(xpath = "//div[contains(text(),'Roles')]")
	WebElement Roles;
	
	@FindBy(xpath = "//div[contains(text(),'Rules')]")
	WebElement Rules;
	
	@FindBy(xpath = "//div[contains(text(),'Users')]")
	WebElement Users;
	
	@FindBy(xpath = "//div[@class='v-list-item__content mx-n5'][normalize-space()='Vault']")
	WebElement Vault;
	
	@FindBy(xpath = "//i[@id='CreateButton'])[1]")
	//@FindBy(xpath = "//*[@id='CreateButton']/*[@id=\"CreateButton\"]/button")
	//@FindBy(xpath = "//*[@id='CreateButton']/*[@id=\"CreateButton\"]")
	WebElement AddRole;
	
	public void settings() {
		Settings.click();
	}
	
	public void domain() {
		Domain.click();
	}
	
	public void Roles() {
		Roles.click();
	}
	
	public void AddRoles()
	{
		AddRole.click();
	}
}
