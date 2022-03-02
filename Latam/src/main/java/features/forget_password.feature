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

@forgetpassword
Feature: Forget Password Functionality

 @forgetpassword
   Scenario Outline: Validate if user is able to click on forget username functionality
    Given user is on the login pagee
    When user clicks on forget password
    And User enters username "<username_ID>"
    And User confirms username "<confirm_username_ID>"
    Then User checks the I am not a robot 
    Then User clicks the next tab
    Then User click on send button 

    Examples: 
      | username_ID | confirm_username_ID |
      | testphone   | testphone           |
