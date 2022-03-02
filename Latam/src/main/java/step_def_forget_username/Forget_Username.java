package step_def_forget_username;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class Forget_Username {
	
	Page_Objects po;
	   
	   @Before
	   public void init() throws IOException
	   {    
		   po = new Page_Objects();
	   }
	   
	   @Given("user is on the login page1")
	   public void user_is_on_the_login_page() {
	       po.gettitle();
	   }
	   
	   @When("user clicks on forget username")
	   public void user_clicks_on_forget_username() {
	      po.forget_username();
	   }

	   @And("User enters e-mail address {string}")
	   public void user_enters_e_mail_address(String string) throws InterruptedException {
	       po.enter_email(string);
	       Thread.sleep(10000);
	   }

	   @And("User confirms e-mail address {string}")
	   public void user_confirms_e_mail_address(String string) {
		   po.confirm_email(string);
	   }

	   @Then("User checks the I am not a robot box")
	   public void user_checks_the_I_am_not_a_robot_box() {
	       po.robot_check();
	   }

	   @Then("User clicks the next button")
	   public void user_clicks_the_next_button() {
	       po.next();
	   }
	   
	   
	 @Then("User clicks on the continue button and redirect to login page")  
	 public void User_clicks_on_the_continue_button_and_redirect_to_login_page()
	 {
		 po.continuesubmit();
	 }

}
