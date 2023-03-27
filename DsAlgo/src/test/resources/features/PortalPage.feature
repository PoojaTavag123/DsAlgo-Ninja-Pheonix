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
@dsalgo-portal-page
Feature: Validate DsAlgo URL & portal

  @test-url
  Scenario: Validate DsAlgo portal URL
    Given user is in internet browser
    When user enters DsAlgo portal "https://dsportalapp.herokuapp.com/"
    Then DsAlgo portal page with title "Preparing for the Interviews" opens 

  @test-get-started-btn
  Scenario: Validate get started button
    When user clicks get started button
    Then user is redirected to home page with title "NumpyNinja"