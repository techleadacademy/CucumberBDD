@adminCouponPage
  Feature: Admin Coupon Page test
    @addingCoupon @smoke @regression
    Scenario: Verify new coupon is created
      Given User opens Admin home page
      When User logsin with admin account
      And User navigate to Coupons page
      And Creates a new coupon
      Then Verifies coupon is created