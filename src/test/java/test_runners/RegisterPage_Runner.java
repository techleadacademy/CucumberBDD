package test_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "step_definitions",
        plugin = {
                "pretty",//inEVE
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumberTestReports.json",
        },
        tags = {"@registerPage"},
        dryRun = false
)
public class RegisterPage_Runner {
}
