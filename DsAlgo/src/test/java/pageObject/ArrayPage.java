package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
	
	public WebDriver driver;
	
	
	By signInLinkByObj 			   			  =  By.xpath(("//a[@href='/login']"));
	By arrayGetStartedByObj 	   			  =  By.xpath("//html/body/div[2]");
	By arraysInPythonByObj 		   			  =  By.xpath("//a[text()='Arrays in Python']");
	By arraysUsingListByObj 	   			  =  By.xpath("//a[text()='Arrays Using List']");
	By basicOperationsInListsByObj 			  =  By.xpath("//a[text()='Basic Operations in Lists']");
	By applicationsOfArrayByObj   			  =  By.xpath("//a[text()='Applications of Array']");
	By practiceQuestionsByObj     			  =  By.xpath("//div[@id='content']//a[text()='Practice Questions']");
	By tryHereByObj 			   			  =  By.xpath("//a[text()='Try here>>>']");
	By runByObj 				              =  By.xpath("//form[@id='answer_form']//button");
	By searchTheArrayByObj                    =  By.xpath("//div[@class='list-group'][1]/a");
	By maxConsecutiveOnesByObj                =  By.xpath("//div[@class='list-group'][2]/a");
	By findNumbersWithEvenNumberOfDigitsByObj =  By.xpath("//div[@class='list-group'][3]/a");
	By squaresOfASortedArrayByObj 			  =  By.xpath("//div[@class='list-group'][4]/a");
	
	
	
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
	
 }
	public void clickSignInLink() {
		driver.findElement(signInLinkByObj).click();
	}
	
	public void clickArrayGetStarted() {
		driver.findElement(arrayGetStartedByObj).click();
	}
	public void clickArraysInPython() {
		driver.findElement(arraysInPythonByObj).click();
	}
	
	public void clickArraysUsingList() {
		driver.findElement(arraysUsingListByObj).click();
	}
	public void clickBasicOperationsInList() {
		driver.findElement(basicOperationsInListsByObj).click();
	}
	public void clickApplicationsOfArray() {
		driver.findElement(applicationsOfArrayByObj).click();
	}
	
	public void clickPracticeQuestionsOfArray() {
		driver.findElement(practiceQuestionsByObj).click();
	}
	
	public void clickTryHereInArray() {
		driver.findElement(tryHereByObj).click();
	}
	
	public void clickRunInArray() {
		driver.findElement(runByObj).click();
	}
	
	public void clickSearchTheArray() {
		driver.findElement(searchTheArrayByObj).click();
	}
	
	public void clickMaxConsecutiveOnesInArray() {
		driver.findElement(maxConsecutiveOnesByObj).click();
	}
	
	public void clickfindNumbersWithEvenNumberInArray() {
		driver.findElement(findNumbersWithEvenNumberOfDigitsByObj).click();
	} 
	
	public void clickSquaresOfASortedArray() {
		driver.findElement(squaresOfASortedArrayByObj).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
