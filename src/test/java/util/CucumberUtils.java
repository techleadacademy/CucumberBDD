package util;


import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class CucumberUtils {
    //private static WebDriver driver = Driver.getDriver();

    public static void logInfo(String msg, boolean takeScreenshot){
        Scenario scenario = Hooks.currentScenario;
        scenario.write(DateUtils.currentDateTime() + " INFO: " + msg);

        if (takeScreenshot)
            scenario.embed(((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
    }



}
