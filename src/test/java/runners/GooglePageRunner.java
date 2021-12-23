package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "/Users/sandeep/eclipse-workspace/BDDSample/src/test/resources/features/GoogleSearch.feature",	
		glue = {"stepDefs"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
//				"usage:target/reports/usageReport",
//				"json:target/reports/jsonReport.json" ,
				"html:target/reports/htmlReport.html",
				
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
//				"junit:target/reports/junitReport.xml"}
				"rerun:target/failed_scenarios.txt"
				}
		)


public class GooglePageRunner {
	

}
