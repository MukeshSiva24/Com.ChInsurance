package CHTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mukes\\eclipse-workspace\\Com.ChInsurance\\src\\test\\resources\\Task.feature",
		glue = "CHStepDefinition",
		tags = "@Sanity",
//		plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		plugin = {"html:target/Report.html","json:target/report.json"},
		dryRun = false,
		monochrome = false
		)

public class TestRunner {

}
