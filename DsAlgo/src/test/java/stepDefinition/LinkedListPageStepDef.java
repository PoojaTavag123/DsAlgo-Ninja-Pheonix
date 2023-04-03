package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LinkedListPage;


public class LinkedListPageStepDef extends BaseClass {
	
	@Given("user is in linked list page")
	public static void user_is_in_array_page() throws InterruptedException {
		hp.clickLsGetStarted();
		lp = new LinkedListPage(driver);
		Thread.sleep(500);
	}
	
	@When("^user clicks linked list page topic link (.*)$")
	public static void user_clicks_ls_topic_links(String topicText) throws InterruptedException {
		
		if (topicText.equals("Introduction")) {
			lp.clickIntroductionLink();
			System.out.print("###### Introduction");
		}
		else if (topicText.equals("Creating Linked LIst")) {
			lp.clickCreateLinkedListLink();
			System.out.print("###### Creating Linked List");
		}
		else if (topicText.equals("Types of Linked List")) {
			lp.clickTypesOfLinkedListLink();
		}
		else if (topicText.equals("Implement Linked List in Python")) {
			lp.clickImplementLinkedListInPythonLink();
		}
		else if (topicText.equals("Traversal")) {
			lp.clickTraversalLink();
		}
		else if (topicText.equals("Insertion")) {
			lp.clickInsertionLink();
			
		}if (topicText.equals("Deletion")) {
			lp.clickDeletionLink();
		}
		
		
		Thread.sleep(500);
	}
    @Then("^user is redirected to linked list topic page with titile (.*)$") 
    public static void user_redirected_to_ls_topic_page(String expTopicTitleText) throws InterruptedException {
    	String actTopicTitleText = lp.getTopicPageTitleText();
    	
    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
    	Thread.sleep(500);
    }

    @When("user clicks try here in linked list page")
    public static void user_clicks_try_here_ls_page() {
    	lp.clickTryHereBtn();
    }
    
}