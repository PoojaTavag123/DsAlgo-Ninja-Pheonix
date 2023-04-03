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

	Background: Validate sign in page
		Given user is in sign in page

	@signin-register-link    
  Scenario: Validate register link on sign in page
    When user clicks register link
    Then user is redirected to register page having button with text "Register"

  @signin-incomplete-input
  Scenario Outline: Validate SignIn with incomplete input
    When user enters <UserName> and <Password> and clicks login button
    Then sign in validation error <ValidationMsg> appears at location <Location>
    
    Examples: 
      | UserName  | Password 	| ValidationMsg 							| Location |
      |     	    |     	    | Please fill out this field. | Username |
      | username1 |     	 	  | Please fill out this field. | Password |
			|     			| Password1 | Please fill out this field. | Username |
			

  @signin-complete-input-fail
  Scenario Outline: Validate SignIn with complete input
    When user enters <UserName> and <Password> and clicks login button
    Then user gets sign in <AlertMessage>

    Examples: 
      | UserName  				| Password 		| AlertMessage 									| 
      | fdgdf 						|    fdfg 		| Invalid Username and Password | 
  
  
 @signin-complete-input-pass
  Scenario: Validate SignIn with complete input
		When user enters valid username and password
		Then user is signed in and redirected to home page with alert message "You are logged in"
		When user clicks signout link
		Then user is signed out and redirected to home page with alert message "Logged out successfully"

  