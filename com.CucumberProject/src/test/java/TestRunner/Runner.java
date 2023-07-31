package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\Feature",
		glue={"StepDefinition"},
		dryRun =false,
		//tags ="@input2",
		monochrome = true,
		//plugin = {"pretty","html:target\\cucumberproject\\report.html"}//-->HTML Report
		//plugin = {"pretty","json:target\\cucumberproject\\report.json"}//-->Json Report
		//plugin = {"pretty","junit:target\\cucumberproject\\report.xml"}//-->Junit Report
		plugin = {"pretty","html:target\\cucumberproject\\report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}//Extent Report
		)
public class Runner {
	
	
	}


