package Stepdefination;

import Allpages7.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefination extends Loginpage {
	
	

	@Given("User is on login page")
	public  void Userisonloginpage()
	{
		BrowserInitilization(Loginpage.Browser , Loginpage.URL);
	}
	
	@When("User enter the username {string}")
	public  void Userentertheusername(String username)
	{
		Enter_username(username,Loginpage.inputuser );
	}
	
	@And("User enter the password {string}")
	public void Userenterthepassword(String pass)
	{
		Enter_pass(pass, Loginpage.password1);
	}
	
	@Then("User click on login button")
	public  void Userclickonloginbutton()
	{
		click_login();
	}
	 

}
