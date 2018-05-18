package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith (Cucumber.class)	
@CucumberOptions(
		features={"features"},
		glue= {"StepDefinition"},
		tags = {"@Firefox"},
		format = {"pretty","html:target/cucumber-html-report","jsoon:json_output/cucumber.json"},
		dryRun= false,
		strict=true,
		monochrome=true)
		
		
	
public class TestRunner{
	
}
	
	
	
	

