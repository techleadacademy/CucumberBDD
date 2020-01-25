package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class AdminHomePage {
    private static WebDriver driver = Driver.getDriver();

    public AdminHomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    public WebElement emailField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login_Btn;

    @FindBy(xpath = "//a[contains(text(),'Coupons')]")
    public WebElement coupons_Btn;

}
