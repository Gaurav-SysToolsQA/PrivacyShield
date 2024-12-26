Feature: Login with Valid Credentials

  @sanity
  Scenario: Successful Login with Valid Credentials
    When user enters email as "admin@mx.com" and password as "mx@123"
    And the user clicks on the Login button
    And click on settings
    And click on roles
    Then click on add roles
    