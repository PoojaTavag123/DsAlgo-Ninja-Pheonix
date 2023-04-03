package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	
		WebDriver driver;
		
		By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
		
		By OperationsinStackByObj = By.xpath("//a[text()='Operations in Stack']");
		By ImplementationByObj = By.xpath("//a[text()='Implementation']");
		By ApplicationsByObj = By.xpath("//a[text()='Applications']");
		By practiceQuestionsLinkByObj = By.xpath("//div[@id='content']//a[text()='Practice Questions']");
		By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
		
		public StackPage(WebDriver driver) {
			this.driver=driver;
		}
		public void clickOperationsInStackLink() {
			driver.findElement(OperationsinStackByObj).click();
		}
		public void clickImplementationLink() {
			driver.findElement(ImplementationByObj).click();
		}
		public void clickApplicationsLink() {
			driver.findElement(ApplicationsByObj).click();
		}
		public void clickTryHereBtn() {
			driver.findElement(tryHereBtnByObj).click();
		}
		public String getTopicPageTitleText() {
		  return driver.findElement(topicPageTitleByObj).getText();
		}
	}

