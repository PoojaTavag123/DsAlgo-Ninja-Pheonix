package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.PortalPage;
import pageObject.HomePage;

public class PortalPageStepDef extends BaseClass {

	/*
	@dsalgo-portal-page
	Feature: DsAlgo URL & portal page validation

	  @test-url
	  Scenario: Validate if DsAlgo portal URL works
	    Given user is in internet browser
	    When user enters DsAlgo portal "https://dsportalapp.herokuapp.com/"
	    Then DsAlgo portal page with title "Preparing for the Interviews" opens 

	  @test-get-started-btn
	  Scenario: Validate if get started button works
	    When user clicks get started button
	    Then user is redirected to home page with title "NumpyNinja"
	 */
	
	@Given("user is in internet browser") 
	public void user_launches_internet_browser() {
		pp = new PortalPage(driver);
	}
	
	@When("user enters DsAlgo portal URL") 
	public void user_enters_portal_url() {
		driver.get(cr.getConfigPropertyValue("URL"));
	}
	
	@Then("DsAlgo portal page with title {string} opens") 
	public void dsalgo_portal_launches(String expTitle) {
		String actTitle = pp.getPortalPageTitle();
		Assert.assertTrue(actTitle.contains(expTitle));
	}
	
	@When("user clicks get started button") 
	public void user_clicks_get_started_btn() {
		pp.clickGetStartedBtn();
	}
	
	@Then("user is redirected to home page with title {string}")
	public void redirected_home_page_from_portal_page(String expTitle) {
		hp = new HomePage(driver);
		String actTitle = hp.getHomePageTitle();
		Assert.assertTrue(actTitle.contains(expTitle));
	}
	
}
