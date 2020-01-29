package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminCouponPage;
import pages.AdminHomePage;
import step_definitions.step_impl.AdminCouponPage_Impl;
import step_definitions.step_impl.AdminHomePage_Impl;
import util.CucumberUtils;
import util.Driver;
import util.SeleniumUtils;

import java.util.List;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();
    AdminCouponPage_Impl adminCouponPage_Impl = new AdminCouponPage_Impl();



    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        adminCouponPage_Impl.createNewCoupon();
    }

    @Then("Verifies coupon is {string}")
    public void verifies_coupon_is(String status) {
        switch (status.toLowerCase()){
            case "created":
                Assert.assertTrue(adminCouponPage_Impl.verifyIfCouponExists());
                CucumberUtils.logInfo("Coupon created",true);
                break;
            case "deleted":
                SeleniumUtils.waitForPageToLoad();
                CucumberUtils.logInfo("Coupon deleted",true);
                Assert.assertFalse(adminCouponPage_Impl.verifyIfCouponExists());
        }

    }

    @Then("Deletes newly created coupon")
    public void deletes_newly_created_coupon() {
        adminCouponPage_Impl.deleteLastCreatedCoupon();
    }


}
