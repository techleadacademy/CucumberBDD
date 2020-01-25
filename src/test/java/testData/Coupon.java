package testData;

public class Coupon {
    private String percentage;
    private String maxUse;
    private String couponCode;
    private String startDate;
    private String endDate;

    public Coupon(String percentage, String maxUse, String couponCode, String startDate, String endDate){
        this.percentage = percentage;
        this.maxUse = maxUse;
        this.couponCode = couponCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getMaxUse() {
        return maxUse;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
