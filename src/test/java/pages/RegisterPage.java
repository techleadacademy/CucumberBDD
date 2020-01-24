package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class RegisterPage{
    private static WebDriver driver = Driver.getDriver();
    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmpassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUp_Btn;









}
