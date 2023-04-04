package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty", "html:target/cucumber-report.html"}, //reporting
		monochrome=false, //console-output
		//tags= "@dsalgo-portal-page or @dsalgo-signin-page or @dsalgo-register-page or @dsalgo-home-page or @dsalgo-array-page or @dsalgo-ds-page or @dsalgo-ls-page or @dsalgo-queue-page",
		tags= "@dsalgo-portal-page",
		features="src/test/resources/features/",		
		glue={"stepDefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}