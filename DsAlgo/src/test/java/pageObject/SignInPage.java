package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	public WebDriver driver;
	
	By registerLinkByObj = By.xpath("//a[@href='/register']");
	By signInLinkByObj = By.xpath("//a[@href='/login']");
	By usernameByObj = By.id("id_username");
	By passwordByObj = By.id("id_password");
	By logInBtnByObj = By.xpath("//input[@value='Login']");
	By alertMsgByObj = By.xpath("//div[@class='alert alert-primary']");
	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickRegisterLink() {
		driver.findElement(registerLinkByObj).click();
	}
	
	public void clickSignInLink() {
		driver.findElement(signInLinkByObj).click();
	}
	
	public void enterUsername(String username) {
		driver.findElement(usernameByObj).sendKeys(username);
	}
	
	public String getUsernameValMsg() {
		return driver.findElement(usernameByObj).getAttribute("validationMessage");
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordByObj).sendKeys(password);
	}
	
	public String getPasswordValMsg() {
		return driver.findElement(passwordByObj).getAttribute("validationMessage");
	}
	
	public void clickLoginBtn() {
		driver.findElement(logInBtnByObj).click();
	}
	
	public String getLoginBtnText() {
		return driver.findElement(logInBtnByObj).getAttribute("Value");
	}
	
	public String getAlertMsg() {
		return driver.findElement(alertMsgByObj).getText();
	}
	
}
