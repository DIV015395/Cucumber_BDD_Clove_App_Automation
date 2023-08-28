Feature: Testing the login functionality
  @sanity
  Scenario: User logs in with userid password
    Given Launch the driver
    When user will enter the user id
    When user will enter the password
    When user will click on Go button
    Then user will click on notification allowed

  @regression
  Scenario: User logs in with empty password
    Given Launch the driver
    When user will enter the user id
    When user will click on Go button
    Then user will click on notification allowed

  @regression
  Scenario: User logs in with empty user id
    Given Launch the driver
    When user will enter the password
    When user will click on Go button
    Then user will click on notification allowed

    @regression
  Scenario: User logs in with empty password
    Given Launch the driver
    When user will click on Go button
    Then user will click on notification allowed






