package stepDefinition;


import static stepDefinition.DriverManager.getDriver;
import org.openqa.selenium.WebDriver;



import pageObject.HomePage;
import pageObject.PortalPage;
import pageObject.RegisterPage;
import pageObject.SignInPage;



public class BaseClass {
	
	public static WebDriver driver;
	
	public static PortalPage pp;
	public static HomePage hp;
	public static SignInPage sp;
	public static RegisterPage rp;
	
	static {
		driver = getDriver();
	}

}
