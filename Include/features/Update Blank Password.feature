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
  Scenario Outline: Unsuccessfully update a blank password
  
    Given User navigate to login page; <username>,<password>
    When User click on update password in user profile icon
    And User left blank for password and click update
    Then User verify that there is an error message pop up

    Examples: 
      | username | password |
      | empxt.latihan05@yopmail.com | 4JQqRJl2zAuXmLlBSHYn+w== |
      