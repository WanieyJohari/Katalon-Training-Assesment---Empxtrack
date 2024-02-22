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
@tag
Feature: Profile Icon Feature
 

  @tag1
  Scenario Outline: Successfully update a password
  
    Given User login and go to main page
    When User click on update password in user profile icon menu
    And User managed to change current password to a new one; <password>, <newPassword>, <confirmPassword>
    Then User verify that the password has been successfully updated

    Examples: 
      |password|newPassword|confirmPassword|
      |cIjZX7FQSD5JPNYeXpMicQ==|4JQqRJl2zAuXmLlBSHYn+w==|4JQqRJl2zAuXmLlBSHYn+w==|
 