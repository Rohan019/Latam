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
Feature: Forget Username Functionality

  Scenario Outline: Validate if user is able to click on forget username functionality
    Given user is on the login page1
    When user clicks on forget username
    And User enters e-mail address "<email_address>"
    And User confirms e-mail address "<confirm_email_address>"
    Then User checks the I am not a robot box
    Then User clicks the next button
    Then User clicks on the continue button and redirect to login page

    Examples: 
      | email_address                 | confirm_email_address         |
      | shreshtha.singhal@metlife.com | shreshtha.singhal@metlife.com |
