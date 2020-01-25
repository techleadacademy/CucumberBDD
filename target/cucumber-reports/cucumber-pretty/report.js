$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/adminCouponPage.feature");
formatter.feature({
  "name": "Admin Coupon Page test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@adminCouponPage"
    }
  ]
});
formatter.scenario({
  "name": "Verify new coupon is created",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@adminCouponPage"
    },
    {
      "name": "@addingCoupon"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens Admin home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_Admin_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logsin with admin account",
  "keyword": "When "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logsin_with_admin_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Coupons page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_navigate_to_Coupons_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Creates a new coupon",
  "keyword": "And "
});
formatter.match({
  "location": "AdminCouponPage_STEPS.creates_a_new_coupon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies coupon is created",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminCouponPage_STEPS.verifies_coupon_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});