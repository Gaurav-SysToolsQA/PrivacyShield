package stepDefinations;

import java.io.IOException;
import java.util.Properties;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.HomePage;

public class LoginSteps 
{
	
	LoginPage lp;
	HomePage hp;
	Properties p;
	
	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) throws IOException 
	{
        BaseClass.getLogger().info("Entering email and password.. ");

    	lp=new LoginPage(BaseClass.getDriver());
    	p=BaseClass.getProperties();
    	lp.setEmail(email);
    	lp.setPassword(pwd);
       	//lp.setEmail(p.getProperty("email"));
        //lp.setPassword(p.getProperty("password"));
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() 
	{
		 lp.clickLogin();
	     BaseClass.getLogger().info("clicked on login button...");
	    
	}
	
	@Then("user should able to see home page")
	public void user_should_able_to_see_login_page() 
	{
		BaseClass.getLogger().info("Verifying Company Logo.. ");
		
		hp=new HomePage(BaseClass.getDriver());
		hp.Logo();
	}

}
