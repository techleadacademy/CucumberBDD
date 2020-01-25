package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;

public class HomePage_impl {

    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickMyAccountBtn(){
        SeleniumUtils.click(homePage.myAccount_Btn);
    }

    public void clickSignUp(){
        clickMyAccountBtn();
        SeleniumUtils.click(homePage.signUp_Btn);
    }



}
