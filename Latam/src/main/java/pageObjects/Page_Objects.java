package pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Connection;
import cucumber.api.Scenario;

public class Page_Objects extends Connection {
	
	
//.......................................................LOGIN_Elements.............................................................................
	
	
	@FindBy(xpath ="//*[@id=\"USER\"]")
	WebElement username ;
	
	@FindBy(xpath ="//*[@id=\"PASSWORD\"]")
	WebElement password ;
	
	
	@FindBy(xpath = "//*[@id=\"loginFormSubmit\"]")
	WebElement login ;
	

//..................................................Forget_Username_Elements........................................................................	
	
	
	@FindBy(xpath = "//*[@id=\"forgotUsername\"]")
	WebElement forget_username ;
	
	@FindBy(xpath = "//input[@id=\"UsernameEmail\"]")
	WebElement enter_email_address ;
	
	@FindBy(xpath = "//input[@id=\"UsernameConfirmEmail\"]")
	WebElement confirm_email_address ;
	
	@FindBy(xpath = "//div[@role=\"presentation\"][2]")
	WebElement notrobot_check ;
	
	@FindBy(xpath = "//*[@id=\"forgotUsernameConfirmSubmitted\"]")
	WebElement next ;
	
	@FindBy(id = "UsernameSuccessFormSubmit")
	WebElement confirm ;
	
	@FindBy(id = "MfaForgotUsernameLink")
	WebElement cancel ;
	
	
	
	
//..................................................Forget_Password_Elements..........................................................................
	
	
	@FindBy(xpath = "//*[@id=\"forgotPassword\"]")
	WebElement forget_password ;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement enter_user_ID ;

	@FindBy(xpath = "//*[@id=\"confirmEmail\"]")
	WebElement confirm_user_ID ;
	
	@FindBy(id = "passwordResetFormSubmit")
	WebElement confirm_password ;
	
	@FindBy(id="MfaForgotUsernameLink")
	WebElement cancel_password;
	

//*********************** Update Info Elements *******************************
	
	@FindBy(xpath="//label[@class='checkboxLabel']")
	WebElement update_checkbox;
	
	
	@FindBy(xpath="//input[@id = 'MfaMissingPhone']")
	WebElement update_phone;
	
	
	
	
	@FindBy(xpath="//input[@id = 'MfaUpdateEmail']")
	WebElement update_email;
	
	
	
	@FindBy(xpath="//button[@id='MfaMissingPhoneFormSubmit']")
	WebElement update;
	

	
//.............................OTP...................................................
	
	@FindBy(xpath="//*[@id='MfaCode']")
	WebElement enterotp;
	
	@FindBy(xpath="//*[@id='passwordResetFormSubmit']")
	WebElement submitotp;

	
//.......................................Resend_Verification_Code............................................
	
	@FindBy(xpath="//*[@id='MfaCodeVerifyResendCode']")
	WebElement resendverificationcode;
	
	
//.......................................Contact_Support....................................................
	
	@FindBy(xpath="//*[@id='MfaCodeVerifyContactSupport']")
	WebElement contactsupport;
	
	@FindBy(xpath="//*[@id='close']")
	WebElement closecontactsupport;
	

//..................................................Screenshot............................................................................
	
	public void takescreenshot() throws IOException {
		
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\SDEEPAKY\\Downloads\\Mexico\\Screenshot\\img.png");
			FileHandler.copy(src, des);
		
	}
	

//..........................................................................................................................................
	
	

	
	public Page_Objects() throws IOException
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
	//@Test
	public void enterusername(String name )
	{
		username.sendKeys(name);
	}
	//@Test
	public void enterpassword(String pass)
	{   
		password.sendKeys(pass);	
	}
	
	//@Test
	public void enterlogin()
	{  	
		login.click();
	}
	
	
	
//*************************** forget username **************************************
	
	
	//@Test
	public void forget_username()
	{  	
		forget_username.click();
	}
	//@Test
	public void enter_email(String email)
	{  	
		enter_email_address.sendKeys(email);
	}
	//@Test
	public void confirm_email(String email)
	{  	
		confirm_email_address.sendKeys(email);
	}
	//@Test
	public void robot_check()
	{  	
		notrobot_check.click();
	}
	//@Test
	public void next()
	{  	
		next.click();
	}
	//@Test
	public void continuesubmit()
	{
		confirm.click();
	}
	//@Test
	public void cancel_username()
	{
		cancel.click();
	}
	
	
	
//********************forget password ***********************************************************	
	
	//@Test
	public void forget_password()
	{  	
		forget_password.click();
	}
	//@Test
	public void enter_user_id(String userID)
	{  	
		enter_user_ID.sendKeys(userID);
	}
	//@Test
	public void confirm_user_id(String email)
	{  	
		confirm_user_ID.sendKeys(email);
	}
	//@Test
	public void send_password()
	{
		confirm_password.click();
	}

	//@Test
	public void cancel_password()
	{
		cancel_password.click();
	}
	
//************************** update info ****************************************************
	
	//@Test
	public void clickoncheckbox()
	{
		
		
		update_checkbox.click();
	}
	//@Test
	public void updatephone()
	{
		
		 
		 update_phone.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 
		update_phone.sendKeys("7686452623");
	}
	//@Test
	public void updateemail()
	{
		
		update_email.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		update_email.sendKeys("shreshtha.singhal@metlife.com");
	}

	//@Test
	public void update()
	{
		update.click();
	}
	
//********************************* missing info ********************************
	//@Test
	public void misphone()
	
{      
        
        if(update_phone.isDisplayed())
        {
        	update_phone.sendKeys("7857654786");
        }
        else
        {
        	System.out.println("there is no element to update");
        }
	}
	//@Test
	public void misemail()
	{  
		if(update_email.isDisplayed())
		{
		update_email.sendKeys("shreshtha.singhal@metlife.com");
		}
		else
		{
			System.out.println("there is no element to update");
		}
	}
	
//**********************************OTP****************************************************
	//@Test
	public void enterotp() {
		enterotp.sendKeys("111111");
	}
	//@Test
	public void submitotp() {
		submitotp.click();
	}
	
//*****************************************Resend_Verification_Code********************
	//@Test
	public void resendverificationcode() {
		resendverificationcode.click();
	}
	
//*********************************************Contact_Support******************************************
	//@Test
	public void contactsupport() {
		contactsupport.click();
		}
	//@Test
	public void closecontactsupport() {
		closecontactsupport.click();
		}
	
}
