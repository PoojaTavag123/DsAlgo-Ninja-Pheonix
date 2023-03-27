package stepDefinition;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	
	public static WebDriver dmg;

    @BeforeAll
    public static void before_all() {
    	WebDriverManager.firefoxdriver().setup();	
    	dmg= new FirefoxDriver();
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
			byte[] screenshot=((TakesScreenshot)driver_dmg).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		}
	}
    @Step("screenshot")
    public void step1(){

        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver_dmg).getScreenshotAs(OutputType.BYTES)));
    }
    
    */

}
