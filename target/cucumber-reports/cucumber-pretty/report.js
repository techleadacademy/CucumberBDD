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
  "name": "Verify coupon created and deleted",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bookingPage"
    },
    {
      "name": "@deleteCoupon"
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
