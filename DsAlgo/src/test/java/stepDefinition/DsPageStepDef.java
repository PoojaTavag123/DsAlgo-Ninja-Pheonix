package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DsPage;


public class DsPageStepDef extends BaseClass {
	
	@Given("user is in ds page")
	public static void user_is_in_ds_page() throws InterruptedException {
		hp.clickDsGetStarted();
		dp = new DsPage(driver);
		Thread.sleep(500);
	}
	
	@When("^user clicks ds page topic link (.*)$")
	public static void user_clicks_ds_topic_links(String topicText) throws InterruptedException {
		if (topicText.equals("Time Complexity")) {
			dp.clickTimeComplexityLink();
			System.out.print("###### Time Complexity");
		}
		Thread.sleep(500);
	}
    @Then("^user is redirected to ds topic page with titile (.*)$") 
    public static void user_redirected_to_ds_topic_page(String expTopicTitleText) throws InterruptedException {
    	String actTopicTitleText = dp.getTopicPageTitleText();
    	
    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
    	Thread.sleep(500);
    }

    @When("user clicks try here in ds page")
    public static void user_clicks_try_here_ds_page() {
    	dp.clickTryHereBtn();
    }  

}


