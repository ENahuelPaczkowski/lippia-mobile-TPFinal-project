@Configurations
Feature: Configuration

  Background:
    When The user enter his email
    And The user enter password
    And user login
    When The user enters the settings

  @DarkMode
  Scenario: Enable dark mode
    Then Enable dark mode

  @Notifications
  Scenario: Disable notifications
    Then Disable notifications
