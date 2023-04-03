package pageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {

	WebDriver driver;
	
	By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
	
	By clickGraphByObj=By.xpath("//a[@href='graph']");
	By clickGraphRepByObj=By.xpath("//a[@href='graph-representations']");
	By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
	
	public GraphPage(WebDriver driver) {
		this.driver=driver;
	}
	public String getTopicPageTitleText() {
		return driver.findElement(topicPageTitleByObj).getText();
	}
	public void clickGraphLink() {
		driver.findElement(clickGraphByObj).click();
	}
	public void clickGraphRepLink() {
		driver.findElement(clickGraphRepByObj).click();
	}
	public void clickTryHereBtn() {
		driver.findElement(tryHereBtnByObj).click();
	}
}
	
	
	
