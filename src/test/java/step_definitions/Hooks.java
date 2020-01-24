package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Driver;

public class Hooks{

    @Before
    public void beforeScenario(){
        Driver.getDriver();
        System.out.println("Starting scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("Ending scenario");
        Driver.quitDriver();
    }
}
