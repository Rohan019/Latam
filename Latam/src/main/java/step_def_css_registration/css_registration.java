package step_def_css_registration;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CSS_Registration_Object;
import pageObjects.Page_Objects;

public class css_registration {

	CSS_Registration_Object co;
	
	@Before
	   public void init() throws IOException
	   {    
		   co = new CSS_Registration_Object();
	   }
	
	@Given("User is on the CSS Registration page")
	public void user_is_on_the_CSS_Registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    co.gettitle();
	}

	@Given("User selects Life Savings insurance policy")
	public void user_selects_Life_Savings_insurance_policy() {
	    co.policytype();
	}

	@Then("User enters the policy number")
	public void user_enters_the_policy_number() {
	   co.policynumber("FRR4432");
	}

	@Then("user clicks on Start registration button")
	public void user_clicks_on_Start_registration_button() {
	    co.startregistration();
	}

	@Given("User is able to redirect to personal details page")
	public void user_is_able_to_redirect_to_personal_details_page() {
	    co.gettitle();
	}

	@When("User is able to enter {string}")
	public void user_is_able_to_enter(String string) {
	    co.enterEmail(string);
	}

	@When("User is able to enter {string} in phone number")
	public void user_is_able_to_enter_in_phone_number(String string) {
	    co.enterPhonenumber(string);
	}

	@When("User is able to enter {string} in rfc id")
	public void user_is_able_to_enter_in_rfc_id(String string) {
	   co.enterRFCid(string);
	}

	@When("User is able to enter {string} in dob")
	public void user_is_able_to_enter_in_dob(String string) {
	    co.enterDOB(string);
	}

	@Then("User clicks the authorization check box")
	public void user_clicks_the_authorization_check_box() throws InterruptedException {
	    co.acceptAuthorize();
	}

	@Then("User clicks the accept policy check box")
	public void user_clicks_the_accept_policy_check_box() {
	    co.acceptPrivacy();
	}

	@Then("User clicks on next button")
	public void user_clicks_on_next_button() {
	    co.next();
	}

}
