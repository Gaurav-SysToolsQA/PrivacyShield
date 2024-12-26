package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjetcts.BasePage;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='EmailId']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='PasswordId']")
	WebElement txtPassword;

	@FindBy(xpath = "//span[@class='v-btn__content']")
	WebElement btnLogin;


	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

}
