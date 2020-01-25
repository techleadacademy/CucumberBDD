package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import util.Driver;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();


    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Verifies coupon is created")
    public void verifies_coupon_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
