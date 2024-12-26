package stepDefinations;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.Settings;

public class Domain 
{
	LoginPage lp;
	Settings st;
	
	/*@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) 
	{
        BaseClass.getLogger().info("Entering email and password.. ");

    	lp=new LoginPage(BaseClass.getDriver());
       	lp.setEmail(email);
        lp.setPassword(pwd);
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() 
	{
		 lp.clickLogin();
	     BaseClass.getLogger().info("clicked on login button...");
	    
	}*/
	
	@Then("user should able to click on settings")
	public void user_should_able_to_click_on_settings() 
	{
		st=new Settings(BaseClass.getDriver());
	    st.settings();
	}

	@Then("user should able to click on domain")
	public void user_should_able_to_click_on_domain() 
	{
	    st.domain();
	}

	
}
