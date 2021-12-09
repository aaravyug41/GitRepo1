package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features ={"src/test/resources/parallel"},
                 glue =  {"parallel"},
                 tags = "@tag5",
                 plugin ={"pretty",
                 		"json:target/cucumber.json",
                 		"html:taget/report1.html"},
		publish = true)
public class runner2 extends AbstractTestNGCucumberTests {

	
	@DataProvider(parallel= true)
	public Object[][] scenarios(){
	
		return super.scenarios();
	}
	
	
}
