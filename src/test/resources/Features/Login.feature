Feature: Feature to test Login Functionality

  Scenario: Check Login is sccessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
