package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Connection;

public class CSS_Registration_Object extends Connection{

	//...............................................CSS_Registration_Life/Savings insurance.......................................................................
	
	@FindBy(xpath ="//input[@value=\"life\"]")
	WebElement  Life_Savings_insurance;
	
	@FindBy(xpath ="//input[@id=\"PolicyNumber\"]")
	WebElement  policynumber;
	
	@FindBy(xpath ="//button[@id=\"continue\"]")
	WebElement  startregistration;
	
	@FindBy(xpath ="//*[@id=\"Email\"]")
	WebElement  Email;
	
	@FindBy(xpath ="//*[@id=\"Phone\"]")
	WebElement  Phonenumber;
	
	@FindBy(xpath ="//*[@id=\"RFC\"]")
	WebElement  RFCid;
	
	@FindBy(xpath ="//input[@id=\"DOB\"]")
	WebElement  Dob;
	
	@FindBy(xpath ="//input[@id=\"acceptAuthorize\"]")
	WebElement  Authorization;
	
	@FindBy(xpath ="//input[@id='acceptPrivacy']")
	WebElement  Acceptance;
	
	@FindBy(xpath ="//button[@id=\"continue\"]")
	WebElement  next;
	
	
	
	//***************************************************CSS_Registration_Life/Savings insurance******************************************

	public CSS_Registration_Object() throws IOException
	{   
		setup();
		PageFactory.initElements(driver, this);
		
	}





	//@Test
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public void policytype() {
		boolean check = Life_Savings_insurance.isSelected();
		if(check==true) {
			System.out.println("User has selected the Life/Savings insurance");
		}
		else {
			Life_Savings_insurance.click();
			System.out.println("User has selected the Life/Savings insurance");
		}
	}
	
	public void policynumber(String pnum)
	{
		policynumber.sendKeys(pnum);
	}
	
	
	public void startregistration()
	{
		startregistration.click();
	}
	
	public void enterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void enterPhonenumber(String num)
	
	{
		Phonenumber.sendKeys(num);
	}
	
	public void enterRFCid(String rfc)
	{
		RFCid.sendKeys(rfc);
	}
	
	
	public void enterDOB(String dob)
	{
		RFCid.sendKeys(dob);
	}
	
	public void acceptAuthorize()
	{
		Authorization.click();
	}
	
	public void acceptPrivacy()
	{
		Acceptance.click();
	}
	
	public void next()
	{
		next.click();
	}
}


