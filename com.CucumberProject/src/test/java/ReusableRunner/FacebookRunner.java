package ReusableRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature1",
		glue = {"ReusableMethod"},
		dryRun = false,
		monochrome = true)
public class FacebookRunner {

}
