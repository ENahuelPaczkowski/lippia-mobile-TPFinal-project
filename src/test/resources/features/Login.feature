@LoginFeature
Feature: Login

  Background:
    Given The app is loaded correctly
    When The user enter his email
    And The user enter password
    And user login

  @Login
  Scenario: The user log in to the app.
    Then Home page is displayed

  @Logout
  Scenario: The user log out the app.
    And The user enters the settings
    When Logout
    Then Verify logout