package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalPage {
	
	public WebDriver driver;
	
	By pageTitleByObj = By.xpath("/html/body/div[1]/div/div/h1");
	By getStartedBtnByObj = By.xpath("//button[@class='btn']");
	
	public PortalPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPortalPageTitle() {
		return driver.findElement(pageTitleByObj).getText();
	}
	
	public void clickGetStartedBtn() {
		driver.findElement(getStartedBtnByObj).click();
	}
	
}
