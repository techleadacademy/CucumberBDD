@adminHomePage @admin
  Feature: Admin Home Page testing
    Scenario: Verify Admin home page
      Given User opens Admin home page
      When User logsin with admin account
      Then Verifies title is Dashboard