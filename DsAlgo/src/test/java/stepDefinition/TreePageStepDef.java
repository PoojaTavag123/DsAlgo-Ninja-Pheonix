package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TreePage;


public class TreePageStepDef extends BaseClass {
	
	@Given("user is in tree page")
	public static void user_is_in_tree_page() throws InterruptedException {
		hp.clickTreeGetStarted();
		tp = new TreePage(driver);
		Thread.sleep(500);
	}
	
	@When("^user clicks tree page topic link (.*)$")
	public static void user_clicks_tree_topic_links(String topicText) throws InterruptedException {
		
		if (topicText.equals("Overview of Trees")) {
			tp.clickOverviewOfTreesLink();
			System.out.print("###### Overview of Trees	");
		}
		else if (topicText.equals("Terminologies")) {
			tp.clickTerminologiesLink();
			System.out.print("###### Terminologies");
		}
		else if (topicText.equals("Types of Trees")) {
			tp.clickTypesOfTreesLink();
		}
		else if (topicText.equals("Tree Traversals")) {
			tp.clickTreeTraversalsLink();
		}
		else if (topicText.equals("Traversals-Illustration")) {
			tp.clickTraversalsIllustrationLink();
		}
		else if (topicText.equals("Binary Trees")) {
			tp.clickBinaryTreesLink();
		}
		else if (topicText.equals("Types of Binary Trees")) {
			tp.clickTypesOfBTLink();
			
		} else if (topicText.equals("Implementation in Python")) {
			tp.clickImplementationInPythonLink();
		}
		
		else if (topicText.equals("Binary Trees Traversals")) {
			tp.clickBinarytreeTraversalsLink();
		}
		
		else if (topicText.equals("Implementation of Binary Trees")) {
			tp.clickImplementationOfBtreeLink();
		}
		
		else if (topicText.equals("Applications of Binary trees")) {
			tp.clickImplementationInPythonLink();
		}
		else if (topicText.equals("Binary Search Trees")) {
			tp.clickBinarySearchTreesLink();
		}
		else if (topicText.equals("Implementation Of BST")) {
			tp.clickImplementationOfBSTLink();
		}
		

		Thread.sleep(500);
	}
	
    @Then("^user is redirected to tree topic page with title (.*)$") 
    public static void user_redirected_to_array_topic_page(String expTopicTitleText) throws InterruptedException {
    	String actTopicTitleText = tp.getTopicPageTitleText();
    	
    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
    	Thread.sleep(500);
    }

    @When("user clicks try here in tree page")
    public static void user_clicks_try_here_array_page() {
    	tp.clickTryHereBtn();
    }
    
}