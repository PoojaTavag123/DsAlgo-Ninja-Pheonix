package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DsPage {


	WebDriver driver;
	
	By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
	
	By timecomplexityByObj=By.xpath("//a[text()='Time Complexity']");
	
	By practiceQuestionsLinkByObj = By.xpath("//div[@id='content']//a[text()='Practice Questions']");
	By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
	
	
	public DsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTopicPageTitleText() {
		return driver.findElement(topicPageTitleByObj).getText();
	}

	public void clickTimeComplexityLink() {
		driver.findElement(timecomplexityByObj).click();
	}
	
	public void clickTryHereBtn() {
		driver.findElement(tryHereBtnByObj).click();
	}

}
