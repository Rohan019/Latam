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

Feature: Validate the user is able to fill the missing Information

Scenario: Given user is on the login page for missingInfo Flow
Then user enters the correct username
Then user enters the correct password
Then user click on the login button
Then user is able to fill the missing phone
Then user is able to fill the missing email
Then user click on the button
Then User enters the OTP for missing info
Then User clicks the missing info otp submit button
