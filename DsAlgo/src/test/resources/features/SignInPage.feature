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
@dsalgo-signin-page
Feature: Validate DsAlgo SignIn page

	@signin-register-link    
  Scenario: Validate register link
  	Given user is in home page "https://dsportalapp.herokuapp.com/"
    When user clicks register link
    Then user is redirected to register page having button with text "Register"

  @signin-incomplete-input
  Scenario Outline: Validate SignIn with incomplete input
  	Given user is in sign in page
    When user enters <UserName> and <Password> and clicks login button
    Then sign in validation error <ValidationMsg> appears at location <Location>
    
    Examples: 
      | UserName  | Password 	| ValidationMsg 							| Location |
      |     	    |     	    | Please fill out this field. | Username |
      | username1 |     	 	  | Please fill out this field. | Password |
			|     			| Password1 | Please fill out this field. | Username |
			

  @signin-complete-input
  Scenario Outline: Validate SignIn with complete input
    When user enters <UserName> and <Password> and clicks login button
    Then user gets sign in <AlertMessage> based on the <Result>

    Examples: 
      | UserName  				| Password 		| AlertMessage 									| Result 	|
      | fdgdf 						|    fdfg 		| Invalid Username and Password | Fail		|
      | Pooja@NumpyNinja 	| RT56YU@78 	| You are logged in							| Pass		|
  
  