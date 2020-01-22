package step_definitions;

import org.junit.After;
import org.junit.Before;
import util.Driver;

public class Hooks {

    @Before
    public void beforeScenario(){
        Driver.getDriver();
    }

    @After
    public void afterScenario(){
        Driver.quitDriver();
    }
}
