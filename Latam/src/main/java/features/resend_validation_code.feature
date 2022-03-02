#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Resend Validation Code

  Scenario Outline: Validate if user is able to login with valid credentials
    Given user is on login page
    And user enters username "<username>"
    When user enters password "<password>"
    And user clicks the login button
    Then User clicks on resend validation code
    Then User enters OTP 
    Then User clicks on submit button
    
    

    Examples: 
      | username  | password  |
      | testphone | Netlife12 |
      |testphone1| Netlife12|
      |testphone|Netlife1|
      |testphone1|Netlife1|
