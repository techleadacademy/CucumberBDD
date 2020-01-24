package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.RegisterPage;
import step_definitions.step_impl.RegisterPage_impl;
import util.Driver;
import util.SeleniumUtils;

public class RegisterPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    RegisterPage_impl registerPage = new RegisterPage_impl();

    @When("User navigates to Register page")
    public void user_navigates_to_Register_page() {
       registerPage.clickSignUp();
    }

    @When("Creates new User")
    public void creates_new_User() {
        registerPage.registerNewUser();
    }

    @Then("Verifies title is My Account")
    public void verifies_title_is_My_Account() {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals("My Account", driver.getTitle());
    }

}
