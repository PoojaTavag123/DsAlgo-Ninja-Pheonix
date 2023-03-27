package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
public WebDriver driver;
	
	By registerLinkByObj = By.xpath("//a[@href='/login']");
	By signInLinkByObj = By.xpath("//a[@href='/login']");
	By usernameByObj = By.id("id_username");
	By passwordByObj = By.id("id_password1");
	By confirmnPasswordByObj = By.id("id_password2");
	By registerBtnByObj = By.xpath("//input[@value='Register']");
	By alertMsgByObj = By.xpath("//div[@class='alert alert-primary']");
	By loginLinkByObj = By.xpath("//a[@href='/login']");
	
	public RegisterPage(WebDriver driver) {
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
	
	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(confirmnPasswordByObj).sendKeys(confirmPassword);
	}
	
	public String getConfirmPasswordValMsg() {
		return driver.findElement(confirmnPasswordByObj).getAttribute("validationMessage");
	}
	
	public void clickRegisterBtn() {
		driver.findElement(registerBtnByObj).click();
	}
	
	public String getRegisterBtnText() {
		return driver.findElement(registerBtnByObj).getAttribute("Value");
	}
	
	public void clickLoginLink() {
		driver.findElement(loginLinkByObj).click();
	} 
	
	public String getAlertMsg() {
		return driver.findElement(alertMsgByObj).getText();
	}
}
