package step_def_missing_info;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Page_Objects;

public class missingInfo {

	Page_Objects po;
	   
	   @Before
	   public void init() throws IOException
	   {    
		   po = new Page_Objects();
	   }
	
	   @Given("user is on the login page for missingInfo Flow")
	   public void user_is_on_the_login_page_for_missingInfo_Flow()
	   {
		   po.gettitle();
	   }
	
	@Then("user enters the correct username")
	public void user_enters_the_correct_username() {
		
		po.enterusername("testmismail3");
	    
	}

	@Then("user enters the correct password")
	public void user_enters_the_correct_password() {
		
		po.enterpassword("Netlife12");
	    
	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		
		po.enterlogin();
	    
	}

	@Then("user is able to fill the missing phone")
	public void user_is_able_to_fill_the_missing_phone() {
		
	
		
		po.misphone();
		
	    
	}
	
	@Then("user is able to fill the missing email")
	public void user_is_able_to_fill_the_missing_email() {
		
		
		po.misemail();
	    
	}

	@Then("user click on the button")
	public void user_click_on_the_button() {
		
		po.update();
	    
	}
	
	@Then("User enters the OTP for missing info")
	public void user_enters_the_OTP_for_missing_info() {
	    po.enterotp();
	}

	@Then("User clicks the missing info otp submit button")
	public void user_clicks_the_missing_info_submit_button() {
	   po.submitotp();
	}


	
	
	
}



