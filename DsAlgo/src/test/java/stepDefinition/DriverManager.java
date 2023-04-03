package stepDefinition;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
//import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigFileReader;

//import io.qameta.allure.Allure;
//import io.qameta.allure.Step;

public class DriverManager {
	
	
	public static WebDriver dmg;
	public static ConfigFileReader cr = new ConfigFileReader();

    @BeforeAll
    public static void before_all() {
    	String dp = cr.getConfigPropertyValue("driver");
    	System.out.println("########## Driver Type Selected: "+dp);
    	if (dp.equals("FireFox")) {
    		WebDriverManager.firefoxdriver().setup();	
        	dmg= new FirefoxDriver();
    	}
    	if (dp.equals("Edge")) {
    		System.out.println("########## Driver Type Selected If: "+dp);
    		System.setProperty("webdriver.edge.driver", "/Users/rajkulkarni/Documents/MyDocs/msedgedriver");
    		      //instance of EdgeDriver
    		dmg = new EdgeDriver();
    	}
    	if (dp.equals("Chrome")) {
    		WebDriverManager.chromedriver().setup();	
	    	dmg= new ChromeDriver();
    	}
    	
    	
    	
    }

    public static WebDriver getDriver(){
        return dmg;
    }
    @AfterAll
    public static void after_all() {
    	dmg.quit();
    }
    
    /*
    @After
	public void after(Scenario scenario) {
		if(scenario.isFailed()){
			byte[] screenshot=((TakesScreenshot)dmg).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		}
	}
    
    @Step("screenshot")
    public void step1(){

        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver_dmg).getScreenshotAs(OutputType.BYTES)));
    }
    */
    

}
