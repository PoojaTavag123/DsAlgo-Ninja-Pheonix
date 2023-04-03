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
@dsalgo-home-page
Feature: Validate Home Page check
  
  Background: Validate home page
  	Given user is in home page

  @home-page_dropdown
  Scenario: Check whether the Data Structures drop down works or not
    When user clicks Data Structures dropdown
    Then user should see "6" different entries
   

  @home-page-get-started
  Scenario Outline: Validate alert message when user clicks any of the getStarted button without logging in
    When user clicks <GetStartedBtn> getstarted button without logging in
    Then alert message "You are not logged in" should appear
    
    Examples: 
      | GetStartedBtn   |
      | DataStructure		|
      | Array						|
      | LinkedList			|
      | Stack 					|
      | Queue						|
      | Tree 						|
      | Graph						|
      
   @home-page_signIn
   Scenario: Check whether SignIn page is working 
   When user clicks SignIn link from home page
   Then user should be redirected to SignIn page having "Login" button
   
   @home-page_register
   Scenario: Check whether Register button is working 
   When user clicks Register link from home page
   Then user should be redirected to Register page having "Register" button
   
   