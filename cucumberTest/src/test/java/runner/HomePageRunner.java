package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*******
 * 
 *tags = { "@homePage"} this will filter scenarios tagged with @checkout and will run those test cases
 */

@CucumberOptions(glue = "stepDefinition", 
features = "src/test/resources/features", 
plugin = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json" }, 
tags = { "@homePage"}, monochrome = true)
public class HomePageRunner extends AbstractTestNGCucumberTests{


}
