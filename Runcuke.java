package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="src/test/resources/features", glue ="Steps", plugin= {"pretty","html:target/Runcuke/cucumber.html"}, monochrome= true
		
		)
public class Runcuke extends AbstractTestNGCucumberTests{

	
}
