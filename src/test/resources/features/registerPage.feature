@registerPage
Feature: Register Page Testing

  Scenario: Verify new User created
    Given User opens home page
    When User navigates to Register page
    And Creates new User
    Then Verifies title is My Account