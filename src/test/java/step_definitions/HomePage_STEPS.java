package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    @Given("User opens home page")
    public void user_opens_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }

    @When("User sees My Account button")
    public void user_sees_My_Account_button() {
        SeleniumUtils.waitForVisibilityOfElement(homePage.myAccount_Btn);
    }

    @Then("Verifies title is PHPTRAVELS | Travel Technology Partner")
    public void verifies_title_is_PHPTRAVELS_Travel_Technology_Partner() {
        Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());
    }


}
