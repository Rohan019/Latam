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
Feature: CSS Registration

  Background: verify CSS Registration page
    Given User is on the CSS Registration page
    And User selects Life Savings insurance policy
    Then User enters the policy number
    Then user clicks on Start registration button

  Scenario Outline: verify Personal details page
    Given User is able to redirect to personal details page
    When User is able to enter "<EmailID>"
    And User is able to enter "<Phonenumber>" in phone number
    And User is able to enter "<RFCId>" in rfc id
    And User is able to enter "<DOB>" in dob
    Then User clicks the authorization check box
    Then User clicks the accept policy check box
    Then User clicks on next button

    Examples: 
      | EmailID                  | Phonenumber | RFCId      | DOB      |
      | pramod.sabale@metlife.com |   5546372827 | CARA850634 | 12031999 |
#      | pramod.sabale@metlife.com |   5546371219 | CARA850634 | 12031999 |
#      | pramod.sb@metlife.com     |   5546372827 | CARA850634 | 12031999 |
#      | pramod.sb@metlife.com     |   5546371219 | CARA850634 | 12031999 |
