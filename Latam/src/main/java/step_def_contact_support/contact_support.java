package step_def_contact_support;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class contact_support {
	
	Page_Objects po;

	@Before
	public void init() throws IOException
	{
	po = new Page_Objects();
	}

	@Given("user enters the username {string}")
	public void user_enters_the_username(String string) {
	po.enterusername(string);
	}

	@And("user enters the password {string}")
	public void user_enters_the_password(String string) {
	po.enterpassword(string);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	po.enterlogin();
	}

	@Then("click on contact support")
	public void click_on_contact_support() {
	po.contactsupport();
	}
	
	@Then("User closes the contact window")
	public void user_closes_the_contact_window() {
	    po.closecontactsupport();
	}


}
