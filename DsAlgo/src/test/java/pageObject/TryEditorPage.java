package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.google.common.base.Strings;

public class TryEditorPage {
	
	public WebDriver driver;
	
	By runByObj =  By.xpath("//form[@id='answer_form']//button");
	//By enterCodeByObj = By.xpath("//form[@id='answer_form']//button");
	By enterCodeByObj = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By resultByObj = By.xpath("//*[@id='output']");
	
	public TryEditorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterCode(String code) {
		driver.findElement(enterCodeByObj).sendKeys(code);
	}
	
	public void clearCode() throws InterruptedException {
		Thread.sleep(500);
		//driver.findElement(enterCodeByObj).sendKeys("delete");
		//Thread.sleep(500);
		//driver.findElement(enterCodeByObj).clear();
		driver.findElement(enterCodeByObj).sendKeys(Keys.COMMAND,"a");
		//Thread.sleep(2000);
		driver.findElement(enterCodeByObj).sendKeys(Keys.DELETE);
	}
	
	public void clickRunBtn() {
		driver.findElement(runByObj).click();
	}
	
	public String getRunBtnText() {
		return driver.findElement(runByObj).getText();
	}
	
	public Boolean isAlertPresent() {
	    try{
	    	Alert alert = driver.switchTo().alert();
	    	System.out.println(alert.getText()+" Alert is Displayed"); 
	    	alert.accept();
	    	return true;
	    }
	    catch(NoAlertPresentException ex){
	    	System.out.println("Alert is NOT Displayed");
	    }
	    return false;
	}
	
	public String getResult() {
		return driver.findElement(resultByObj).getText();
	}
	
	public Boolean isResultPresent() {
		String resultText = getResult();
		if(!Strings.isNullOrEmpty(resultText)) {
			return true;
		}
		return false;
	}

	
}
