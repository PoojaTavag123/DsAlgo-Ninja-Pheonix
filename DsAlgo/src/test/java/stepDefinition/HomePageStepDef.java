package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.PortalPage;
import pageObject.RegisterPage;
import pageObject.SignInPage;

public class HomePageStepDef extends BaseClass {
	
	@Given("user is in home page of DS algo portal with url {string}")
	 public void user_in_home_page (String url) {
		pp = new PortalPage(driver);
		hp = new HomePage(driver);
		driver.get(url);
		driver.manage().window().maximize();
		pp.clickGetStartedBtn();
	}
	@When("user clicks Data Structures drop down")
	  public void user_clicks_Data_Structures_drop_down() throws InterruptedException {
		Thread.sleep(1000);
		hp.clickDsDropDown();
		Thread.sleep(1000);	
	}
	@Then("user should see {string} differentdata structures entries in that drop down")
	  public void drop_down_menu_has_six_different_data_structures(String expListSize) {
		int actDropDownListSize = hp.getDropDownSize();
		Assert.assertTrue(actDropDownListSize == Integer.valueOf(expListSize));
			
	}
	
	@When("^user clicks (.*) getstarted button without logging in$")
	public void user_clicks_any_of_the_Get_Started_Btn(String getStartedBtnSelText) throws InterruptedException {
		System.out.println("############# getStartedBtnSelText: "+getStartedBtnSelText);
		
		if (getStartedBtnSelText.equals("DataStructure")) {
			 hp.clickDsGetStarted();
		}
		else if (getStartedBtnSelText.equals("Array")) {
			 hp.clickArrayGetStarted();
		}
		else if (getStartedBtnSelText.equals("LinkedList")) {
			 hp.clickLsGetStarted();
		}
		else if (getStartedBtnSelText.equals("Stack")) {
			 hp.clickStackGetStarted();
		}
		else if (getStartedBtnSelText.equals("Queue")) {
			 hp.clickQueGetStarted();
		}
		else if (getStartedBtnSelText.equals("Tree")) {
			 hp.clickTreeGetStarted(); 
		}
		else if (getStartedBtnSelText.equals("Graph")) {
			 hp.clickGraphGetStarted();
		}
		else {
			 Assert.assertTrue(1==2);
		}
		Thread.sleep(500);
	}
	@Then("alert message {string} should appear after clicking get started button")
	public void home_page_alert_msg( String expAlertMsg) {
		String actAlertMsg = hp.getAlertMsg();
		System.out.println("############# Alert Message: "+actAlertMsg);
		Assert.assertTrue(expAlertMsg.equals(actAlertMsg));
		 		
	}
	 
	@When("user clicks SignIn link from home page")
	public void home_page_user_clicks_sign_in_link() {
		hp.clickSignInLink();
	} 
	@Then("user should be redirected to SignIn page having {string} button")
	public void user_lands_in_sign_in_page(String expLoginBtnText) {
		sp = new SignInPage(driver);
		String actLoginBtnText = sp.getLoginBtnText();
		System.out.println("########Alert Message: "+actLoginBtnText);
		Assert.assertTrue(actLoginBtnText.equals(expLoginBtnText)); 
	}
	 
	@When("user clicks Register link from home page")
	public void home_page_user_clicks_register_link() {
		hp.clickRegisterLink();
	} 
	 
	@Then("user should be redirected to Register page having {string} button")
	public void user_lands_in_register_page(String expRegisterBtnText) {
		rp = new RegisterPage(driver);
		String actRegisterBtnText = rp.getRegisterBtnText();
		System.out.println("########Alert Message: "+actRegisterBtnText);
		Assert.assertTrue(actRegisterBtnText.equals(expRegisterBtnText));
	}    

}
