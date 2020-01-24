package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegisterPage;
import testData.NewUserInfo;
import util.Driver;
import util.SeleniumUtils;

public class RegisterPage_impl {
    private static WebDriver driver = Driver.getDriver();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();


    public void navigateToRegisterPage(){
        homePage.clickSignUp();
    }

    public void registerNewUser(){
        NewUserInfo user = new NewUserInfo();
        HomePage homePage = new HomePage();
        homePage.clickSignUp();
        SeleniumUtils.sendKeys(registerPage.firstName, user.getFirstName());
        SeleniumUtils.sendKeys(registerPage.lastName, user.getLastName());
        SeleniumUtils.sendKeys(registerPage.phone, user.getCellPhoneNum());
        SeleniumUtils.sendKeys(registerPage.email, user.getEmail());
        SeleniumUtils.sendKeys(registerPage.password, user.getPassword());
        SeleniumUtils.sendKeys(registerPage.confirmPassword, user.getPassword());

        clickSignUp();
    }

    public void clickSignUp(){
        SeleniumUtils.click(registerPage.signUp_Btn);
    }

    public String getTilte(){
        return driver.getTitle();
    }

}
