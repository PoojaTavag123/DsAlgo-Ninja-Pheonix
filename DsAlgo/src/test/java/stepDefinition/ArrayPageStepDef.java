package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ArrayPage;


public class ArrayPageStepDef extends BaseClass {
	
	@Given("user is in array page")
	public static void user_is_in_array_page() throws InterruptedException {
		hp.clickArrayGetStarted();
		ap = new ArrayPage(driver);
		Thread.sleep(500);
	}
	
	@When("^user clicks array page topic link (.*)$")
	public static void user_clicks_array_topic_links(String topicText) throws InterruptedException {
		
		if (topicText.equals("Arrays in Python")) {
			ap.clickArraysInPythonLink();
			System.out.print("###### Arrays in Python");
		}
		else if (topicText.equals("Arrays Using List")) {
			ap.clickArraysUsingListLink();
			System.out.print("###### Arrays Using List");
		}
		else if (topicText.equals("Basic Operations in Lists")) {
			ap.clickBasicOperationsInListsLink();
		}
		else if (topicText.equals("Applications of Array")) {
			ap.clickApplicationsOfArrayLink();
		}
		Thread.sleep(500);
	}
    @Then("^user is redirected to array topic page with titile (.*)$") 
    public static void user_redirected_to_array_topic_page(String expTopicTitleText) throws InterruptedException {
    	String actTopicTitleText = ap.getTopicPageTitleText();
    	
    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
    	Thread.sleep(500);
    }

    @When("user clicks try here in array page")
    public static void user_clicks_try_here_array_page() {
    	ap.clickTryHereBtn();
    }
    
}
