package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.AdminHomePage_Impl;
import util.ConfigReader;
import util.CucumberUtils;
import util.Driver;
import util.SeleniumUtils;

public class AdminHomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage_Impl adminHomePage = new AdminHomePage_Impl();

    @Given("User opens Admin home page")
    public void user_opens_Admin_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));
    }

    @When("User logsin with admin account")
    public void user_logsin_with_admin_account() {
        adminHomePage.login();
        CucumberUtils.logInfo("Logging in as admin", true);
    }

    @Then("Verifies title is Dashboard")
    public void verifies_title_is_Dashboard() {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals("Dashboard", driver.getTitle());
    }

    @When("User navigate to Coupons page")
    public void user_navigate_to_Coupons_page() {
        adminHomePage.navigateToPage("coupons");
        //CucumberUtils.logInfo("Coupon page opened", true);
    }
}
