package step_def_forget_password;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class Forget_Password {
	
	Page_Objects po;
	   
	   @Before
	   public void init() throws IOException
	   {    
		   po = new Page_Objects();
	   }
	   
    @Given("user is on the login pagee")
	   public void user_is_on_the_login_page() {
		   po.gettitle();
		   
	   }

	   @When("user clicks on forget password")
	   public void user_clicks_on_forget_password()  {
		   po.forget_password();
		   
	   }

	   @When("User enters username {string}")
	   public void user_enters_username(String string) {
		   po.enter_user_id(string);
		   
	   }

	   @When("User confirms username {string}")
	   public void user_confirms_username(String string) {
		   po.confirm_user_id(string);
		  
	   }

	   @Then("User checks the I am not a robot")
	   public void user_checks_the_I_am_not_a_robot() {
		   po.robot_check();
		   
	   }

	   @Then("User clicks the next tab")
	   public void user_clicks_the_next_tab(){
		   po.next();
		   
	   }
	   
	   
	   @Then("User click on send button ")
	   public void User_click_on_send_button()
	   {
		   po.send_password();
	   }

}
