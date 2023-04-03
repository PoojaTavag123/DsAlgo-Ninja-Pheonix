package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.PortalPage;
import pageObject.RegisterPage;
import pageObject.SignInPage;

public class RegisterPageStepDef extends BaseClass {
	
  	@Given("user is in register page")
  	public static void user_in_register_page() throws InterruptedException {
  		pp = new PortalPage(driver);
  		hp = new HomePage(driver);
  		rp = new RegisterPage(driver);
  		sp = new SignInPage(driver);
  		
		driver.get(cr.getConfigPropertyValue("URL"));
		driver.manage().window().maximize();
		pp.clickGetStartedBtn();
		hp.clickRegisterLink();
		Thread.sleep(500);
  		
  	}
    @When("user clicks login link")
    public static void user_clicks_login_link() throws InterruptedException {
    	rp.clickLoginLink();
    	Thread.sleep(500);
    }
    @Then("user is redirected to SignIn page having button with text {string}")
    public static void user_redirected_to_signin_page(String expLoginBtnText) throws InterruptedException {
    	String actLoginBtnText = sp.getLoginBtnText();
    	System.out.print("###### actLoginBtnText: "+ actLoginBtnText);
    	Assert.assertTrue(actLoginBtnText.contains(expLoginBtnText));
    	Thread.sleep(500);
    }

    
    @When("^user enters (.*), (.*) and (.*) clicks register button$")
    public static void user_enters_username_pwd_pwd2(String username, String password, String confirmPassword) throws InterruptedException {
    	rp.enterUsername(username);
    	rp.enterPassword(password);
    	rp.enterConfirmPassword(confirmPassword);
    	Thread.sleep(500);
    	rp.clickRegisterBtn();
    	Thread.sleep(500);
    }
    @Then("^register validation error (.*) appears at location (.*)$")
    public static void check_validation_error(String expValMsg, String location) throws InterruptedException {
    	if (location.equals("Username")) {
    		String actValMsg = rp.getUsernameValMsg();
    		Assert.assertTrue(actValMsg.contains(expValMsg));
    	}
    	else if (location.equals("Password1")) {
    		String actValMsg = rp.getPasswordValMsg();
    		Assert.assertTrue(actValMsg.contains(expValMsg));
    	}
    	else if (location.equals("Password2")) {
    		String actValMsg = rp.getConfirmPasswordValMsg();
    		Assert.assertTrue(actValMsg.contains(expValMsg));
    	}
    	else {
    		Assert.assertTrue(1 == 2);
    	}
    	Thread.sleep(500);
    }
    
    @Then("^user gets register (.*)$")
    public static void validate_alert_msg(String expAlertMsg) throws InterruptedException {
    	String actAlertMsg = rp.getAlertMsg();
    	System.out.println("###### actAlertMsg: "+ actAlertMsg);
    	Assert.assertTrue(actAlertMsg.contains(expAlertMsg));
    	Thread.sleep(500);
    }
    

}
