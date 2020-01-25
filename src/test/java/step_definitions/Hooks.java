package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Driver;

public class Hooks{

    @Before
    public void beforeScenario(){
        Driver.getDriver();
    }

    @After
    public void afterScenario(){
        Driver.quitDriver();
    }
}
