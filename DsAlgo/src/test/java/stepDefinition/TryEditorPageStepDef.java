package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TryEditorPage;

public class TryEditorPageStepDef extends BaseClass {
	
	@Then("user is redirected to editor page having run button with text {string}")
    public static void user_redirected_editor_page(String expRunBtnText) throws InterruptedException {
		
		te = new TryEditorPage(driver);
		String actRunBtnText = te.getRunBtnText();
		System.out.println("###### try editor page : "+actRunBtnText);
    	Assert.assertTrue(actRunBtnText.contains(expRunBtnText));
    	Thread.sleep(500);
    }
    
    @When("^user enters the valid code (.*)$")
    public static void user_enters_valid_code(String code) throws InterruptedException {
    	System.out.println("###### enter code : "+code);
    	te.enterCode(code);
    	Thread.sleep(500);
    	te.clickRunBtn();
    	Thread.sleep(500);
    }
    
    @Then("user should be presented with Run result")
    public static void user_presented_result() throws InterruptedException {
    	String result = te.getResult();
    	Boolean resultPresent = te.isResultPresent();
    	System.out.println("###### result: "+result);
    	System.out.println("###### resultPresent: "+resultPresent);
    	Assert.assertTrue(resultPresent);
    	
    }
    
    
    @When("^user enters invalid code (.*)$")
    public static void user_enters_invalid_code(String code) throws InterruptedException {
    	Thread.sleep(500);
    	te.clearCode();
    	Thread.sleep(500);
    	te.enterCode(code);
    	Thread.sleep(500);
    	te.clickRunBtn();
    	Thread.sleep(500);
    }
    @Then("The user should be presented with error message")
    public static void user_presented_error() throws InterruptedException {
    	
    	Boolean isAlertPresent = te.isAlertPresent();
    	Assert.assertTrue(isAlertPresent);
    	Thread.sleep(500);
    	driver.navigate().back();
    	Thread.sleep(500);
    }

}
