Feature: Login
  As a user I want to login under different types of accounts

  @autopolicy
  Scenario: User logs in for auto policy
    Given user is on the landing page
    Then user selects Auto as account type
    Then user logs in with valid credentials
    And user verifies "Dashboard" name is displayed





