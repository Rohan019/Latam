package step_def_update;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Page_Objects;

public class Update_Info {

	
	Page_Objects po;
	   
	   @Before
	   public void init() throws IOException
	   {    
		   po = new Page_Objects();
	   }
	   
	   @Given("user is on the login page for update_info ")
	   public void user_is_on_the_login_page_for_update_info ()
	   {
		   po.gettitle();
	   }
	
	
	@Then("user enters the username")
	public void user_enters_the_username() {
		
		po.enterusername("testphone");
	    
	}

	@Then("user enters the password")
	public void user_enters_the_password() {
		
		po.enterpassword("Netlife12");
	    
	}

	@Then("user click on the update checkbox")
	public void user_click_on_the_update_checkbox() {
		
		po.clickoncheckbox();
	    
	}

	@Then("user click on the Login button")
	public void user_click_on_the_Login_button() {
	    
		po.enterlogin();
	}

	@Then("user is able to update the phone")
	public void user_is_able_to_update_the_phone() {
		po.updatephone();
	    
	}

	@Then("user is able to update the email")
	public void user_is_able_to_update_the_email() {
		
		po.updateemail();
	    
	}

	@Then("user click on update button")
	public void user_click_on_update_button() {
	    
		po.update();
		
		
	}
	
	@Then("User enters the OTP for update")
	public void user_enters_the_OTP_for_update() {
	    po.enterotp();
	}

	@Then("User clicks the update otp submit button")
	public void user_clicks_the_update_submit_button() {
	    po.submitotp();
	}


	
	
	
	
}
