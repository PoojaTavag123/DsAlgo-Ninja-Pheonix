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
	
	
	/*
	@dsalgo-signin-page
	Feature: Validate DsAlgo SignIn page

	  @signin-incomplete-input
	  Scenario: Validate SignIn with incomplete input
	    Given user is in sign in page
	    When user clicks login without entering username or password
	    Then validation error "Please fill out this field." appears in username input field
	    When user enters "sampleuser" without password and clicks login button
	    Then validation error "Please fill out this field." appears in password input field
	    

	  @signin-complete-input
	  Scenario Outline: Validate SignIn with complete input
	    When user enters <UserName> and <Password>
	    Then user gets <AlertMessage> based on SignIn <Status>

	    Examples: 
	      | UserName  | Password | Status  | AlertMessage |
	      | name1 |     5 | success | |
	      | name2 |     7 | Fail    | |
	*/
	
	@Given("user is in home page {string}")
	public void user_in_home_page(String url) {
		pp = new PortalPage(driver);
		driver.get(url);
		driver.manage().window().maximize();
		pp.clickGetStartedBtn();
		
		hp = new HomePage(driver);
	}
	
    @When("user clicks register link")
    public void click_register_link_in_singin_page() {
    	hp.clickRegisterLink();
    }
    
  
    @Then("user is redirected to register page having button with text {string}")
    public void user_redirected_to_register_page_from_signin_page(String expBtnText) {
    	rp = new RegisterPage(driver);
    	String actBtnText = rp.getRegisterBtnText();
    	Assert.assertTrue(actBtnText.contains(expBtnText));
    }
	
    @Given("user is in sign in page")
	public void user_in_signin_page() {
		rp.clickSignInLink();
	}
	
	
	@When("^user enters (.*) and (.*) and clicks login button$")
	public void click_login_w_username_password(String username, String password) throws InterruptedException {
		sp = new SignInPage(driver);
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
	
	
	@Then("^user gets sign in (.*) based on the (.*)$") 
	public void check_sign_in_page_alert_msg(String expAlertMsg, String result) {
		if (result.equals("Fail")) {
			String actAlertMsg = sp.getAlertMsg();
			System.out.print("###### actAlertMsg Fail: "+ actAlertMsg);
			Assert.assertTrue(actAlertMsg.contains(expAlertMsg));
		}
		else if (result.equals("Pass")) {
			String actAlertMsg = hp.getAlertMsg();
			System.out.print("###### actAlertMsg Pass: "+ actAlertMsg);
			Assert.assertTrue(actAlertMsg.contains(expAlertMsg));
		}
		else {
			Assert.assertTrue(1 == 2);
		}
		
	}
	

}
