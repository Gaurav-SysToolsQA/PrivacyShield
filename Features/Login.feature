Feature: Login with Valid Credentials

  @sanity
  Scenario: Successful Login with Valid Credentials
    When user enters email as "admin@mx.com" and password as "mx@123"
    And the user clicks on the Login button
    Then user should able to see home page
    
  @sanity  @regression
    Scenario Outline: Successful Login with Valid-Invalid Credentials
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then user should able to see home page
    
    Examples:
   |email      | password|
   |abc@mx.com | abc@1235|
   |xyz@mx.com | xyz@1234|

 # @regression
  Scenario: After Successful Login navigate to Domain module
    When user enters email as "admim" and password as "mx@"
    And the user clicks on the Login button
    Then user should able to click on settings
    And user should able to click on domain