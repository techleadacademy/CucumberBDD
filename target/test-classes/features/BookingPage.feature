@bookingPage
Feature: Booking Pages Test
  @couponTest @smoke
  Scenario: Verify coupon code
    Given User opens home page
    When User opens "first tour" featured tour
    And Clicks on "Book Now" button
    And Applies existing coupon code
    Then Verifies positive message is displayed