package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedListPage {
	WebDriver driver;
	By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
	
	By introLinkByObj = By.xpath("//a[@href='introduction']");
	By createLinkedListLinkByObj = By.xpath("//a[text()='Creating Linked LIst']");
	By typesOfLinkedListLinkByObj = By.xpath("//a[text()='Types of Linked List']");
	By linkedListPythonByObj = By.xpath("//a[text()='Implement Linked List in Python']");
	By traversalByObj = By.xpath("//a[text()='Traversal']");
	By insertionByObj = By.xpath("//a[text()='Insertion']");
	By deletionByObj = By.xpath("//a[text()='Deletion']");
	
	By practiceQuestionsLinkByObj = By.xpath("//div[@id='content']//a[text()='Practice Questions']");
	By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
	
	public LinkedListPage(WebDriver driver) {
			this.driver=driver;
	}

	public void clickIntroductionLink() {
		driver.findElement(introLinkByObj).click();
	}
	public void clickCreateLinkedListLink() {
		driver.findElement(createLinkedListLinkByObj).click();
	}
	public void clickTypesOfLinkedListLink() {
		driver.findElement(typesOfLinkedListLinkByObj).click();
	}
	public void clickImplementLinkedListInPythonLink() {
		driver.findElement(linkedListPythonByObj).click();
	}
	public void clickTraversalLink() {
		driver.findElement(traversalByObj).click();
	}
	public void clickInsertionLink() {
		driver.findElement(insertionByObj).click();
	}
	public void clickDeletionLink() {
		driver.findElement(deletionByObj).click();
	}
	public String getTopicPageTitleText() {
		return driver.findElement(topicPageTitleByObj).getText();
	}
	public void clickTryHereBtn() {
		driver.findElement(tryHereBtnByObj).click();
	}
	
}
