package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
	
	public WebDriver driver;
	
	By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
	
	By arraysInPythonLinkByObj =  By.xpath("//a[@href='arrays-in-python']");
	By arraysUsingListLinkByObj =  By.xpath("//a[@href='arrays-using-list']");
	By basicOperationsInListsLinkByObj =  By.xpath("//a[@href='basic-operations-in-lists']");
	By applicationsOfArrayLinkByObj = By.xpath("//a[@href='applications-of-array']");
	
	By practiceQuestionsLinkByObj = By.xpath("//div[@id='content']//a[text()='Practice Questions']");
	By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
	
	By searchArrayLinkByObj = By.xpath("//div[@class='list-group'][1]/a");
	By maxConsOnesLinkByObj = By.xpath("//div[@class='list-group'][2]/a");
	By evenNumberLinkByObj = By.xpath("//div[@class='list-group'][3]/a");
	By sqOfAsrtdArrayLinkByObj = By.xpath("//div[@class='list-group'][4]/a");
	
	
	
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clickArraysInPythonLink() {
		driver.findElement(arraysInPythonLinkByObj).click();
	}
	
	public void clickArraysUsingListLink() {
		driver.findElement(arraysUsingListLinkByObj).click();
	}
	
	public void clickBasicOperationsInListsLink() {
		driver.findElement(basicOperationsInListsLinkByObj).click();
	}
	public void clickApplicationsOfArrayLink() {
		driver.findElement(applicationsOfArrayLinkByObj).click();
	}
	
	public void clickPracticeQuestionsOfArrayLink() {
		driver.findElement(practiceQuestionsLinkByObj).click();
	}
	
	public void clickTryHereBtn() {
		driver.findElement(tryHereBtnByObj).click();
	}
	
	public void clickSearchTheArray() {
		driver.findElement(searchArrayLinkByObj).click();
	}
	
	public void clickMaxConsOnesLink() {
		driver.findElement(maxConsOnesLinkByObj).click();
	}
	
	public void clickEvenNumberLink() {
		driver.findElement(evenNumberLinkByObj).click();
	} 
	
	public void clickSqOfAsrtdArrayLink() {
		driver.findElement(sqOfAsrtdArrayLinkByObj).click();
	}


	public String getTopicPageTitleText() {
		return driver.findElement(topicPageTitleByObj).getText();
	}
	
	
}
