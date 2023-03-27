package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;
	
	By pageTitleByObj = By.xpath("/html/body/div[1]/nav/a");
	By dsDropDownByObj = By.xpath("//div[@class='nav-item dropdown']");
	By dsdropdownItemsByObj = (By.className("dropdown-item"));
	
	By signInLinkByObj = By.xpath(("//a[@href='/login']"));
	By registerLinkByObj = By.xpath(("//a[@href='/register']"));
	
	By dsGetStartedByObj = By.xpath("//*[@href='data-structures-introduction']");
	By arrayGetStartedByObj = By.xpath("//html/body/div[2]");
	By lsGetStartedByObj = By.xpath("//*[@href='linked-list']");
	By stackGetStartedByObj = By.xpath("//*[@href='stack']");
	By queGetStartedByObj = By.xpath("//html/body/div[2]");
	By treeGetStartedByObj = By.xpath("//*[@href='tree']");
	By graphGetStartedByObj = By.xpath("//html/body/div[3]/div[7]/div/div");

	By alertMsgByObj = By.xpath("//div[@class='alert alert-primary']");


	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageTitle() {
		return driver.findElement(pageTitleByObj).getText();
	}

	public void clickSignInLink() {
		driver.findElement(signInLinkByObj).click();
	}
	
	public void clickRegisterLink() {
		driver.findElement(registerLinkByObj).click();
	}

	public void clickDsDropDown() {
		driver.findElement(dsDropDownByObj).click();
	}

	public int getDropDownSize() {
		//WebElement DSDropDownWebElement = driver.findElement(dsDropDownByObj);
		//List<WebElement> DropDownList = DSDropDownWebElement.findElements(dsdropdownItemsByObj);
		List<WebElement> DropDownList = driver.findElements(dsdropdownItemsByObj);
		return DropDownList.size();
	}

	public void clickDsGetStarted() {
		driver.findElement(dsGetStartedByObj).click();	
		
	}
	public void clickArrayGetStarted() {
		driver.findElement(arrayGetStartedByObj).click();
		
	}
	public String getAlertMsg() {
		return driver.findElement(alertMsgByObj).getText();
		
	}

	public void clickLsGetStarted() {
		driver.findElement(lsGetStartedByObj).click();
		
	}

	public void clickStackGetStarted() {
		driver.findElement(stackGetStartedByObj).click();
		
	}

	public void clickQueGetStarted() {
		driver.findElement(queGetStartedByObj).click();
		
	}

	public void clickTreeGetStarted() {
		driver.findElement(treeGetStartedByObj).click();
		
	}

	public void clickGraphGetStarted() {
		driver.findElement(graphGetStartedByObj).click();
		
	}

}
