package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminHomePage_Impl {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();

    public void login(){
        SeleniumUtils.sendKeys(adminHomePage.emailField, ConfigReader.readProperty("usernameAdmin"));
        SeleniumUtils.sendKeys(adminHomePage.passwordField, ConfigReader.readProperty("passwordAdmin"));
        SeleniumUtils.click(adminHomePage.login_Btn);
    }

    public void navigateToPage(String pageName){
        switch (pageName.toLowerCase()){
            case "coupons":
                SeleniumUtils.click(adminHomePage.coupons_Btn);
                break;
        }
    }

}
