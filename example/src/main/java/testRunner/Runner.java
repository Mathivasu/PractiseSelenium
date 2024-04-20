package testRunner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features = {"C:/Users/Lap441/eclipse-workspace/example/src/main/java/feature/login.feature"},
		dryRun = !true,
		glue = "steps",
		monochrome = true
		)
public class Runner extends AbstractTestNGCucumberTests{

}
