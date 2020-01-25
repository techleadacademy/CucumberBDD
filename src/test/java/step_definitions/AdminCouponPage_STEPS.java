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
import util.Driver;

import java.util.List;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();
    AdminCouponPage_Impl adminCouponPage_Impl = new AdminCouponPage_Impl();


    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        adminCouponPage_Impl.createNewCoupon();
    }

    @Then("Verifies coupon is created")
    public void verifies_coupon_is_created() {
        Assert.assertTrue(adminCouponPage_Impl.verifyIfCouponExists());
    }


}
