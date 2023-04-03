package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreePage {

		
		WebDriver driver;
		By topicPageTitleByObj = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
		
		By getStartedTreeByObj = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]//a");
		By OverviewOfTreesByObj= By.xpath("//a[contains(text(),'Overview of Trees')]");
		By terminologiesByObj = By.xpath("//a[contains(text(),'Terminologies')]");
		By typesoftreeByObj = By.xpath("//a[contains(text(),'Types of Trees')]");
		By treeTraversalsByObj = By.xpath("//a[contains(text(),'Tree Traversals')]");
		By illustrationByObj = By.xpath("//a[contains(text(),'Traversals-Illustration')]");
		By binaryTreeByObj = By.xpath("//*[@id='content']/li[6]/a");
		By typesofBtByObj = By.xpath("//a[contains(text(),'Types of Binary Trees')]");
		By binarytreeTraversalsByObj = By.xpath("//a[contains(text(),'Binary Tree Traversals')]");
		By implementationOfPythonByObj = By.xpath("//a[contains(text(),'Implementation in Python')]");
		By implementationOfBtreeByObj = By.xpath("//a[contains(text(),'Implementation of Binary Trees')]");
		By applicationOfBtreeByObj = By.xpath("//a[contains(text(),'Applications of Binary trees')]");
		By binarysearchTreeByObj = By.xpath("//a[contains(text(),'Binary Search Trees')]");
		By implimentationOfBSTByObj = By.xpath("//a[contains(text(),'Implementation Of BST')]");
		
		By practiceQuestionsLinkByObj = By.xpath("//div[@id='content']//a[text()='Practice Questions']");
		By tryHereBtnByObj = By.xpath("//a[text()='Try here>>>']");
		
		public TreePage(WebDriver driver) {
			this.driver=driver;
		}
		public void clickGetStartedTree() {
			driver.findElement(getStartedTreeByObj).click();
		}
		public void clickOverviewOfTreesLink() {
			driver.findElement(OverviewOfTreesByObj).click();
		}
		public void clickTerminologiesLink() {
			driver.findElement(terminologiesByObj).click();
		}
		public void clickTypesOfTreesLink() {
			driver.findElement(typesoftreeByObj).click();
		}
		public void clickTreeTraversalsLink() {
			driver.findElement(treeTraversalsByObj).click();
		}
		public void clickTraversalsIllustrationLink() {
			driver.findElement(illustrationByObj).click();
		}
		public void clickBinaryTreesLink() {
			driver.findElement(binaryTreeByObj).click();
		}
		public void clickTypesOfBTLink() {
			driver.findElement(typesofBtByObj).click();
		}
		public void clickBinarytreeTraversalsLink() {
			driver.findElement(binarytreeTraversalsByObj).click();
		}
		public void clickImplementationInPythonLink() {
			driver.findElement(implementationOfPythonByObj).click();
		}
		public void clickImplementationOfBtreeLink() {
			driver.findElement(implementationOfBtreeByObj).click();
		}
		public void clickApplicationOfBtreeLink() {
			driver.findElement(applicationOfBtreeByObj).click();
		}
		public void clickBinarySearchTreesLink() {
			driver.findElement(binarysearchTreeByObj).click();
		}
		public void clickImplementationOfBSTLink() {
			driver.findElement(implimentationOfBSTByObj).click();
		}
		public String getTopicPageTitleText() {
			return driver.findElement(topicPageTitleByObj).getText();
		}
		public void clickTryHereBtn() {
			driver.findElement(tryHereBtnByObj).click();
		}
		
	}

