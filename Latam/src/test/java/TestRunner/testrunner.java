package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\RSHERBAH\\Downloads\\Latam\\src\\main\\java\\features\\login.feature" 
, glue ="step_def_login", monochrome = true , plugin = {"pretty","html:target/cucumber-pretty","junit:target/report.xml","json:target/jsonreport.json"})

public class testrunner extends AbstractTestNGCucumberTests {
		

}
