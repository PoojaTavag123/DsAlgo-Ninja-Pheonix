package stepDefinition;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GraphPage;


public class GraphPageStepDef extends BaseClass {
	
	@Given("user is in graph page")
	public static void user_is_in_graph_page() throws InterruptedException {
		hp.clickGraphGetStarted();
		gp = new GraphPage(driver);
		Thread.sleep(500);
	}
	
	@When("^user clicks graph page topic link (.*)$")
	public static void user_clicks_graph_topic_links(String topicText) throws InterruptedException {
		//System.out.println("###### Link: "+topicText);
		if (topicText.equals("Graph")) {
			gp.clickGraphLink();
		}
		else if (topicText.equals("Graph Representations")) {
			//System.out.println("###### I am in Graph Representations");
			gp.clickGraphRepLink();
		}
		Thread.sleep(500);
	}
    @Then("^user is redirected to graph topic page with titile (.*)$") 
    public static void user_redirected_to_graph_topic_page(String expTopicTitleText) throws InterruptedException {
    	String actTopicTitleText = gp.getTopicPageTitleText();
    	
    	System.out.println("###### actTopicTitleText: "+actTopicTitleText);
    	System.out.println("###### expTopicTitleText: "+expTopicTitleText);
    	Assert.assertTrue(actTopicTitleText.contains(expTopicTitleText));
    	Thread.sleep(500);
    }

    @When("user clicks try here in graph page")
    public static void user_clicks_try_here_in_graph_page() {
    	gp.clickTryHereBtn();
    }  

}
