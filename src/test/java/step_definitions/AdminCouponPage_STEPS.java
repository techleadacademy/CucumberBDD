package step_definitions;

import com.google.common.collect.Maps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminCouponPage;
import pages.AdminHomePage;
import step_definitions.step_impl.AdminCouponPage_Impl;
import step_definitions.step_impl.AdminHomePage_Impl;
import testData.Coupon;
import util.CucumberUtils;
import util.Driver;
import util.SeleniumUtils;
import java.util.List;
import java.util.Map;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();
    AdminCouponPage_Impl adminCouponPage_Impl = new AdminCouponPage_Impl();
    AdminCouponPage adminCouponPage = new AdminCouponPage();
    public List<Coupon> currentCoupons =null;



    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        adminCouponPage_Impl.createNewCoupon();
    }

    @When("Creates a new coupon with following info")
    public void creates_a_new_coupon_with_following_info(List<Coupon> coupons) {
        currentCoupons = coupons;
        SeleniumUtils.click(adminCouponPage.addNewCoupon_Btn);
        SeleniumUtils.sendKeys(adminCouponPage.percentage_field, currentCoupons.get(0).getPercentage());
        SeleniumUtils.sendKeys(adminCouponPage.maxUses_field, currentCoupons.get(0).getMaxUse());
        SeleniumUtils.sendKeys(adminCouponPage.startDate_field, currentCoupons.get(0).getStartDate());
        SeleniumUtils.sendKeys(adminCouponPage.endDate_field, currentCoupons.get(0).getEndDate());
        SeleniumUtils.click(adminCouponPage.tours_checkBox);
        SeleniumUtils.click(adminCouponPage.cars_checkBox);
        SeleniumUtils.sendKeys(adminCouponPage.codeInput_field,currentCoupons.get(0).getCouponCode());
        SeleniumUtils.click(adminCouponPage.submit_Btn);
        SeleniumUtils.waitForVisibilityOfElement(adminCouponPage.addNewCoupon_Btn);
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
                Assert.assertFalse(adminCouponPage_Impl.verifyIfCouponDoesntExist());
                break;
            case "matched":
        }
        CucumberUtils.logInfo("coupon is created or deleted", true);

    }

    @Then("Deletes newly created coupon")
    public void deletes_newly_created_coupon() {
        adminCouponPage_Impl.deleteLastCreatedCoupon();
    }

    @When("I test data table")
    public void i_test_data_table(List<Map<String, String>> test) {
        for(Map<String, String> map: test){
            System.out.println(map);
        }
    }

    @Given("I navigate to website {string}")
    public void i_navigate_to_website(String website) {
        Driver.getDriver().get(website);
    }

    @Then("Verifies title is {string}")
    public void verifies_title_is(String title) {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }

    @Then("Searches for {string} keyword")
    public void searches_for_keyword(String string) {
        SeleniumUtils.sendKeys(Driver.getDriver().findElement(By.name("q")), string);
        SeleniumUtils.click(Driver.getDriver().findElement(By.name("btnK")));
        SeleniumUtils.sleep(2000);
        CucumberUtils.logInfo("Searched for: " + string, true);
    }

}
