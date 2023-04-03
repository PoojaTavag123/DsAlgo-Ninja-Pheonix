package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.StackPage;

public class StackStepDef extends BaseClass {
		
		@Given("user is in stack page")
		public static void user_is_in_stack_page() throws InterruptedException {
			hp.clickStackGetStarted();
			stp = new StackPage(driver);
			Thread.sleep(500);
		}
		
		@When("^user clicks stack page topic link (.*)$")
		public static void user_clicks_stack_topic_links(String topicText) throws InterruptedException {
			
			if (topicText.equals("Operations in Stack")) {
				stp.clickOperationsInStackLink();
				System.out.print("###### Operations in Stack");
			}
			else if (topicText.equals("Implementation")) {
				stp.clickImplementationLink();
				System.out.print("###### Implementation");
			}
			else if (topicText.equals("Applications")) {
				stp.clickApplicationsLink();
			}
			
			Thread.sleep(500);
		}
	    @Then("^user is redirected to stack topic page with titile (.*)$") 
	    public static void user_redirected_to_stack_topic_page(String expTopicTitleText) throws InterruptedException {
	    	String actTopicTitleText = stp.getTopicPageTitleText();
	    	
	    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
	    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
	    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
	    	Thread.sleep(500);
	    }

	    @When("user clicks try here in stack page")
	    public static void user_clicks_try_here_stack_page() {
	    	stp.clickTryHereBtn();
	    }
	    
	}
