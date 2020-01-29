package step_definitions.step_impl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import testData.Coupon;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_Impl {
    private static WebDriver driver = Driver.getDriver();
    BookingPage bookingPage = new BookingPage();

    public String expectedCouponMessage = AdminCouponPage_Impl.currentCoupon.getPercentage() + "% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page.";


    public void applyCoupon(Coupon coupon){
        SeleniumUtils.sendKeys(bookingPage.couponCodeTextArea, coupon.getCouponCode());
        SeleniumUtils.click(bookingPage.applyCoupon_Btn);
    }

    public String getCouponCodeConfirmationText(){
        return SeleniumUtils.getText(bookingPage.couponAppliedDisplayedText);
    }

    public void clickButton(String buttonName){
        switch (buttonName.toLowerCase()){
            case "book now":
                SeleniumUtils.click(bookingPage.bookNow_Btn);
                break;
            case "cookies": SeleniumUtils.click(bookingPage.cookies_Btn);
                break;
        }
    }




}
