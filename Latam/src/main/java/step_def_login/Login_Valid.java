package step_def_login;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class Login_Valid  {

	
   Page_Objects po;
   
   @Before
   public void init() throws IOException
   {    
	   po = new Page_Objects();
   }
	
   @Given("user is on the login page")
   public void user_is_on_the_login_page() {
       po.gettitle();
   }

   @Given("user enters the  username {string}")
   public void user_enters_the_username(String string) {
       po.enterusername(string);
   }
   @When("user enters the  password {string}")
   public void user_enters_the_password(String string) {
       po.enterpassword(string);
   }
   @When("user clicks on the login button")
   public void user_clicks_on_the_login_button() {
       po.enterlogin();
   }
   
   @Then("User enters the OTP")
   public void user_enters_the_OTP() {
       po.enterotp();
   }

   @Then("User clicks the submit button")
   public void user_clicks_the_submit_button() {
       po.submitotp();
   }
   
   @When("user Takes a screenshot")
   public void user_Takes_a_screenshot() throws IOException {
       po.takescreenshot();
   }
   
   


	
	
}
