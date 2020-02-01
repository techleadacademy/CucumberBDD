@bookingPage
Feature: Booking Pages Test
#  Background: Opening admin page
#    Given User opens Admin home page
#    When User logsin with admin account

  @createCoupon @smoke @admin
  Scenario: Verify coupon code
    #Given User opens Admin home page
    #When User logsin with admin account
    And User navigate to Coupons page
    And Creates a new coupon
    Then Verifies coupon is "created"
    Given User opens home page
    When User opens "first tour" featured tour
    And Clicks on "Book Now" button
    And Applies existing coupon code
    Then Verifies positive message is displayed

  @deleteCoupon @admin @ff
  Scenario: Verify coupon created and deleted
    #Given User opens Admin home page
    #When User logsin with admin account
    And User navigate to Coupons page
    And Creates a new coupon
    Then Verifies coupon is "created"
    And Deletes newly created coupon
    #Then Verifies coupon is "deleted"

  @deleteCouponWithParameter @admin @ff
  Scenario: Verify coupon created and deleted
    Given User opens Admin home page
    When User logsin with admin account
    And User navigate to Coupons page
    And Creates a new coupon with following info
      | percentage | max use | start date | end date   | cars checkbox | coupon code |
      | 99         | 5       | 28/01/2020 | 30/01/2020 | check         | 99% Coupon  |
#      | key           | value      |
#      | percentage    | 99         |
#      | max use       | 5          |
#      | start date    | 28/01/2020 |
#      | end date      | 30/01/2020 |
#      | cars checkbox | check      |
#      | coupon code   | 99% Coupon |
    Then Verifies coupon is "created"


#    And Deletes newly created coupon
#    Then Verifies coupon is "deleted"
#      | percentage | max use | start date | end date   | cars checkbox | coupon code |
#      | 99         | 5       | 28/01/2020 | 30/01/2020 | check         | 99% Coupon  |

  @dataTableTest @ff
  Scenario: Mentoring dataTables
    When I test data table
      | firstName  | lastName   | phone number | ID |
      | Akyl       | Cholurov   | 444          | 1  |
      | Yulduz Eje | Abakirova  | 333          | 2  |
      | Meerim     | Zhumasheva | 222          | 3  |
      | GG         | Malikova   | 555          | 4  |


  @scenarioOutline @ff
  Scenario Outline: Outline example
    Given I navigate to website "<websiteName>"
    Then Verifies title is "<expectedTitle>"
    And Searches for "<keyword>" keyword
    Examples:
      | websiteName        | expectedTitle | keyword           |
      | https://google.com | Google        | toyota highlander |
      | https://google.com | Google        | gigi              |
      | https://google.com | Google        | tla               |

