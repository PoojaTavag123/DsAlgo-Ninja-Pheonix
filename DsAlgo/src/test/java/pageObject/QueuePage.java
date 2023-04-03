package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
	WebDriver driver;
	
	By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
	
	By implementationOfQueueByObj = By.xpath("//a[text()='Implementation of Queue in Python']");
	By implemntationCollectionByObj =By.xpath("//a[text()='Implementation using collections.deque']");
	By implementationArrayByObj = By.xpath("//a[text()='Implementation using array']");
	By queueOperationsByObj = By.xpath("//a[text()='Queue Operations']");
	
	By practiceQuestionsLinkByObj = By.xpath("//div[@id='content']//a[text()='Practice Questions']");
	By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
	
	public QueuePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void clickImplemnentationOfQueueInPythonLink() {
		driver.findElement(implementationOfQueueByObj).click();
	}
	public void clickImplementationCollectionLink() {
		driver.findElement(implemntationCollectionByObj).click();
	}
	public void clickImplementationUsingArrayLink() {
		driver.findElement(implementationArrayByObj).click();
	}
	public void clickQueueOperationsLink() {
		driver.findElement(queueOperationsByObj).click();
	}
	public String getTopicPageTitleText() {
		return driver.findElement(topicPageTitleByObj).getText();
	}
	public void clickTryHereBtn() {
		driver.findElement(tryHereBtnByObj).click();
	}
}
