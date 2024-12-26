package stepDefinations;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.Settings;
import pageObjects.Roles;

public class AddRoles 
{
	LoginPage lp;
	Settings st;
	

	@When("click on settings")
	public void click_on_settings() 
	{
		st=new Settings(BaseClass.getDriver());
	    st.settings();
	}

	@When("click on roles")
	public void click_on_roles() 
	{
		st=new Settings(BaseClass.getDriver());
        st.Roles();
    }
	

	@Then("click on add roles")
	public void click_on_add_roles() 
	{
		st.AddRoles();
	    
	}



}
