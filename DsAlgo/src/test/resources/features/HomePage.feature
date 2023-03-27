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
@dsalgo-home
Feature: Validate Home Page
  

  @home-page_dropdown
  Scenario: Check whether the Data Structures drop down works or not
    Given user is in home page of DS algo portal with url "https://dsportalapp.herokuapp.com"
    When user clicks Data Structures drop down
    Then user should see "6" differentdata structures entries in that drop down
   

  @home-page-get-started
  Scenario Outline: Validate whether alert message is displayed if user clicks any of the getStarted button without logging in
    When user clicks <GetStartedBtn> getstarted button without logging in
    Then alert message "You are not logged in" should appear after clicking get started button
    
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
   
   