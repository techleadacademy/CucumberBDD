package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import step_definitions.step_impl.AdminCouponPage_Impl;
import step_definitions.step_impl.BookingPage_Impl;
import util.CucumberUtils;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    BookingPage_Impl bookingPageImpl = new BookingPage_Impl();


    @When("Clicks on {string} button")
    public void clicks_on_Book_Now_button(String buttonName) {
        bookingPageImpl.clickButton("cookies");
        bookingPageImpl.clickButton(buttonName);
    }

    @When("Applies existing coupon code")
    public void applies_existing_coupon_code() {
        bookingPageImpl.applyCoupon(AdminCouponPage_Impl.currentCoupon);
        CucumberUtils.logInfo("Applied coupon code", true);
    }

    @Then("Verifies positive message is displayed")
    public void verifies_positive_message_is_displayed() {
        Assert.assertEquals(bookingPageImpl.expectedCouponMessage, bookingPageImpl.getCouponCodeConfirmationText());
        CucumberUtils.logInfo("Verify coupon code worked", true);
    }



}
