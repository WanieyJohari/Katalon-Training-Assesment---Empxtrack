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
  Scenario Outline: Unsuccessfully update a password not according to the password policy
  
    Given User enter <username> and <password> in the login page
    When User click on update password on profile menu
    And User enter invalid password to the policy
    Then User received error message

    Examples: 
    | username |password| 
    | empxt.latihan05@yopmail.com | 4JQqRJl2zAuXmLlBSHYn+w== |
    
    