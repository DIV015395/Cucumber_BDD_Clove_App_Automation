Feature: Testing the login functionality

  Scenario: User logs in with userid password
    Given Launch the driver
    When user will enter the user id
    And user will enter the password
    When user will click on Go button
    Then user will click on notification allowed

  Scenario: User logs in with empty password
    Given Launch the driver
    When user will enter the user id
    And user will click on Go button
    Then user will click on notification allowed





