/*
 * in @CucumberOptions features - We have to give complete path as this is not .java file and can be stored anywhere in project.
 * in @CucumberOptions glue - stepDefinition is always .java file so we don't have to give compete path. It search in src folder 
 * (src/main/java or src/test/java)
 * dryRun= true -- if you want to do dry run to check any mistake like missing step definition etc before trying actual execution
 * if you want to run the test then it has to be  dryRun= false
 * monochrome= true --display console output in proper readable format
 * strict =true ----if any step is missing or not executed then it fails the test
 * tags= {"@SmokeTest", "~@RegressionTest"} - means run only scenarios with tag SmokeTest and ignore all test with scenario with tag RegressionTest
 */

package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= {"C:\\Users\\shefali.singh.GROUPINFRA\\eclipse-workspace\\FacebookBDDFramework\\src\\test\\java\\features"}, ---- to run all the feature files
		features= {"C:\\Users\\shefali.singh.GROUPINFRA\\eclipse-workspace\\FacebookBDDFramework\\src\\test\\java\\features\\hookAndTags.feature"},
		glue= {"stepDefinition"},
		format= {"pretty", "html:test-output", "json: json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun= false,
		monochrome= true,
		strict =true,
		tags= {"@MyTag"}
		//tags= {"@SmokeTest", "~@RegressionTest"}
		)

public class TestRunner {

}
