

package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.collections.Objects;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty", "html:target/pooja.html"}, //reporting
		monochrome=false, //console-output
		tags= "@dsalgo-portal-page or @dsalgo-signin-page or @dsalgo-register-page or @dsalgo-home-page or @dsalgo-array-page",
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