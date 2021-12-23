package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "/Users/sandeep/eclipse-workspace/BDDSample/src/test/resources/CRMLoginfeature/Login.feature",	
		glue = {"stepDefs"},
		monochrome=true
		
		)
		
public class LoginRunner {
	

}
