package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "/Users/sandeep/eclipse-workspace/BDDSample/src/test/resources/taggedFeature/ModuleTwo.feature",	
		glue = {"stepDefs"},
		monochrome=true
		//tags = "@RegressionTest"
		// tags = "not @RegressionTest"
	//	tags = "@RegressionTest or @SmokeTest"
		
	//	tags = "@RegressionTest and @SmokeTest"
		
		// Selecting from features
		// tags = "@PhaseOne and @RegressionTest"
		
		//tags = "@RegressionTest or @SmokeTest"
		)


public class taggedRunner {

}
