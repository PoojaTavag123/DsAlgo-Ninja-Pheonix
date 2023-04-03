package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.QueuePage;


public class QueuePageStepDef extends BaseClass {
	
	@Given("user is in queue page")
	public static void user_is_in_que_page() throws InterruptedException {
		hp.clickQueGetStarted();
		qp = new QueuePage(driver);
		Thread.sleep(500);
	}
	
	@When("^user clicks queue page topic link (.*)$")
	public static void user_clicks_que_topic_links(String topicText) throws InterruptedException {
		
		if (topicText.equals("Implementation of Queue in Python")) {
			qp.clickImplemnentationOfQueueInPythonLink();
			System.out.print("###### Implementation of Queue in Python");
		}
		else if (topicText.equals("Implementation using collections.deque")) {
			qp.clickImplementationCollectionLink();
			System.out.print("######  Implementation using collections.deque");
		}
		else if (topicText.equals("Implementation using array")) {
			qp.clickImplementationUsingArrayLink();
		}
		else if (topicText.equals("Queue Operations")) {
			qp.clickQueueOperationsLink();
		}
		Thread.sleep(500);
	}
    @Then("^user is redirected to queue topic page with titile (.*)$") 
    public static void user_redirected_to_array_topic_page(String expTopicTitleText) throws InterruptedException {
    	String actTopicTitleText = qp.getTopicPageTitleText();
    	
    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
    	Thread.sleep(500);
    }

    @When("user clicks try here in queue page")
    public static void user_clicks_try_here_array_page() {
    	qp.clickTryHereBtn();
    }
    
}
