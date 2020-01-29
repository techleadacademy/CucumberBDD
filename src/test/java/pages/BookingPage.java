package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BookingPage {
    private static WebDriver driver = Driver.getDriver();
    public BookingPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader' and text()='Book Now']")
    public WebElement bookNow_Btn;

    @FindBy(xpath = "//label[@class='pure-material-textfield-outlined float-none coupon-label']//input[contains(@placeholder,'')]")
    public  WebElement couponCodeTextArea;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public WebElement applyCoupon_Btn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement couponAppliedDisplayedText;

    @FindBy(xpath = "//button[@aria-label='dismiss cookie message']")
    public WebElement cookies_Btn;


}
