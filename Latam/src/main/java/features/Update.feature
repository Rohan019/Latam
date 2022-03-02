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

Feature: Update Profile Details

Scenario: Given user is on the login page for update_info 

Then user enters the username
Then user enters the password
Then user click on the update checkbox
Then user click on the Login button
Then user is able to update the phone
Then user is able to update the email
Then user click on update button
Then User enters the OTP for update 
Then User clicks the update otp submit button

 



  
