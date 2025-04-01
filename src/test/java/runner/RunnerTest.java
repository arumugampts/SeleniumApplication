package runner;
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resource/computerdb.feature",
        glue= {"StepDefinitions"},
        plugin = {"pretty",
        "html:target/cucumber_reports.html"}
//      dryRun=true,
//  plugin = {"json:target/cucumber.json"},
//          tags="@ui"
//      "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
        )
public class testrunner {
    
}
