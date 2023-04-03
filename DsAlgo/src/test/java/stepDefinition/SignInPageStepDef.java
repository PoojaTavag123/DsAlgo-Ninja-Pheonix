package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.PortalPage;
import pageObject.SignInPage;
import pageObject.RegisterPage;

public class SignInPageStepDef extends BaseClass {
	
	
	@Given("user is in sign in page")
	public void user_in_signin_page() {
		pp = new PortalPage(driver);
		hp = new HomePage(driver);
		sp = new SignInPage(driver);
		rp = new RegisterPage(driver);
		
		driver.get(cr.getConfigPropertyValue("URL"));
		driver.manage().window().maximize();
		pp.clickGetStartedBtn();
		hp.clickSignInLink();
	}
	
    @When("user clicks register link")
    public void click_register_link_in_singin_page() {
    	hp.clickRegisterLink();
    }
    
  
    @Then("user is redirected to register page having button with text {string}")
    public void user_redirected_to_register_page_from_signin_page(String expBtnText) {
    	String actBtnText = rp.getRegisterBtnText();
    	Assert.assertTrue(actBtnText.contains(expBtnText));
    }
	
	
	@When("^user enters (.*) and (.*) and clicks login button$")
	public void click_login_w_username_password(String username, String password) throws InterruptedException {
		sp.enterUsername(username);
		sp.enterPassword(password);
		Thread.sleep(1000);
		sp.clickLoginBtn();
		Thread.sleep(1000);
	}
	
	@Then("^sign in validation error (.*) appears at location (.*)$") 
	public void loign_validation_error_in_username_field(String expValMsg, String location) {
		System.out.print("###### expValMsg: "+ expValMsg);
		System.out.print("###### location: "+ location);
		String actUsernameValMsg = sp.getUsernameValMsg();
		String actPasswordValMsg = sp.getPasswordValMsg();
		Assert.assertTrue(actUsernameValMsg.contains(expValMsg) || actPasswordValMsg.contains(expValMsg));
	}
	
	
	@Then("^user gets sign in (.*)$") 
	public void check_sign_in_page_alert_msg(String expAlertMsg) {
		String actAlertMsg = sp.getAlertMsg();
		System.out.print("###### actAlertMsg Fail: "+ actAlertMsg);
		Assert.assertTrue(actAlertMsg.contains(expAlertMsg));	
	}
	
	@When("user enters valid username and password")
	public static void enter_username_password() throws InterruptedException {
		sp.enterUsername(cr.getConfigPropertyValue("username"));
		sp.enterPassword(cr.getConfigPropertyValue("password"));
		Thread.sleep(1000);
		sp.clickLoginBtn();
		Thread.sleep(500);
	}

	@Then("user is signed in and redirected to home page with alert message {string}")
	public static void user_is_signed_in(String expAlertMsg) throws InterruptedException {
		String actAlertMsg = hp.getAlertMsg();
		System.out.print("###### actAlertMsg Fail: "+ actAlertMsg);
		Assert.assertTrue(actAlertMsg.contains(expAlertMsg));
		Thread.sleep(500);
	}
	
	@When("user clicks signout link")
	public static void user_signout() {
		System.out.println("###### signing out");
		hp.clickSignOutLink();
	}
	@Then("user is signed out and redirected to home page with alert message {string}")
	public static void validate_user_signedout(String expAlertMsg) {
		String actAlertMsg = hp.getAlertMsg();
		System.out.print("###### actAlertMsg Pass: "+ actAlertMsg);
		Assert.assertTrue(actAlertMsg.contains(expAlertMsg));
	}

}
