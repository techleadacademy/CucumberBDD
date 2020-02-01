package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "step_definitions",
        plugin = {
                "pretty",
                "html:target/cucumber-failed-reports/BookingPage-report",
                "json:target/cucumber--failed-reports/cucumberFailedTests.json",
        }
)
public class failedScenario_Runner {
}
