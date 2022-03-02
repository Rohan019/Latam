package step_def_resend_verification_code;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class resend_verification_code {
	
	Page_Objects po;
	   
	   @Before
	   public void init() throws IOException
	   {    
		   po = new Page_Objects();
	   }
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		po.gettitle();
	}

	@And("user enters username {string}")
	public void user_enters_username(String string) {
		 po.enterusername(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		po.enterpassword(string);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		po.enterlogin();
	}

	@Then("User clicks on resend validation code")
	public void user_clicks_on_resend_validation_code() {
	    po.resendverificationcode();
	}

	@Then("User enters OTP")
	public void user_enters_OTP() {
		po.enterotp();
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		po.submitotp();
	}

}
