package TeestRunnirr;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "SteepDeefination")

//tags= {""})

public class TestRunnor extends AbstractTestNGCucumberTests {

}
