package stepDefinition;


import static stepDefinition.DriverManager.getDriver;
import org.openqa.selenium.WebDriver;
import org.testng.internal.Graph;

import utilities.ConfigFileReader;

import pageObject.ArrayPage;
import pageObject.DsPage;
import pageObject.GraphPage;
import pageObject.HomePage;
import pageObject.LinkedListPage;
import pageObject.PortalPage;
import pageObject.QueuePage;
import pageObject.RegisterPage;
import pageObject.SignInPage;
import pageObject.StackPage;
import pageObject.TreePage;
import pageObject.TryEditorPage;



public class BaseClass {
	
	public static WebDriver driver;
	
	public static ConfigFileReader cr = new ConfigFileReader();
	
	public static PortalPage pp;
	public static HomePage hp;
	public static SignInPage sp;
	public static RegisterPage rp;
	public static TryEditorPage te;
	public static ArrayPage ap;
	public static DsPage dp;
	public static QueuePage qp;
	public static StackPage stp;
	public static LinkedListPage lp;
	public static TreePage tp;
	public static GraphPage gp;
	
	
	static {
		driver = getDriver();
	}

}
