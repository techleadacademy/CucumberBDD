$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BookingPage.feature");
formatter.feature({
  "name": "Booking Pages Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@bookingPage"
    }
  ]
});
formatter.scenario({
  "name": "Verify coupon code",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bookingPage"
    },
    {
      "name": "@couponTest"
    },
    {
      "name": "@smoke"
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
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"first tour\" featured tour",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_featured_tour(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on \"Book Now\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingPage_STEPS.clicks_on_Book_Now_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Applies existing coupon code",
  "keyword": "And "
});
formatter.match({
  "location": "BookingPage_STEPS.applies_existing_coupon_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies positive message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.verifies_positive_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});