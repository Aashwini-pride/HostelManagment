package Stepdefination;


import Allpages7.RegistrationHostelform;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registrationstepdefination extends RegistrationHostelform{
	
	@Given("the user is logged in")
	public void the_user_is_logged_in() {
	    // If login is already handled elsewhere, keep it empty
	    // OR add login code here
	}

	@Given("User is on Hostel form page")
	public void UserisonHostelformpage()
	{
	    RegistrationHostelform.driver.get(
	        "https://login.sspu.ac.in/AdmissionForm/HostelAdmissionForm"
	    );
	}
	@When("User Enter LocalGuardianName {string}")
	public static void UserEnterLocalGuardianName(String GuardianName)
	{
		Enter_LocalGuardinnName(GuardianName);
	}
	
	@And("User Enter the GaurdianContactNo {string}")
	public void user_enters_guardian_contact_no(String guardianContactNumber)
	{
		Enter_GaurdianContactNo(guardianContactNumber);
	}
	
	@And("User Enter the LocalGuardianAlternateNo {string}")
	public static void UserEntertheLocalGuardianAlternateNo( String alternateNo)
	{
		Enter_LocalGuardianAlternateNo( alternateNo);
	}
	
    @And("User able to click on check box of decleration")
    public static void Userabletoclickoncheckboxofdecleration()
    {
    	click_Checkboxdecleration();
    }
	
    @And("User able to click on check box of undertaking")
    public static void click_CheckboxUnd()
    {
    	click_CheckboxUnd();
    }
    
   // @Then("click on save button")
    //public static void clickonsavebutton()
   // {
    //	clickonsavebutton();
   // }
	
	

}
