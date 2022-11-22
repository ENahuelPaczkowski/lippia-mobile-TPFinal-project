@Entry
Feature: Entry

  Background:
    When The user enter his email
    And The user enter password
    And user login
    When click on Add time entry button

  @AddTime
  Scenario: Add time
    And Add hours '05'
    And Add minutes '03'
    And Save new time
    Then Verify added time

    When Delete entry

  @AddTimeCanceled
  Scenario: Add time canceled
    And Add hours '03'
    And Add minutes '02'
    And Discard entry
    Then verify no time entries