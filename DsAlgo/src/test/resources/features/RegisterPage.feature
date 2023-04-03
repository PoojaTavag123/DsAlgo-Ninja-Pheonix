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
@dsalgo-register-page
Feature: Validate DsAlgo register page

	Background: Validate register page
		Given user is in register page

	@register-login-link    
  Scenario: Validate login link
    When user clicks login link
    Then user is redirected to SignIn page having button with text "Login"

  @register-incomplete-input-fail
  Scenario Outline: Validate register with incomplete input
    When user enters <UserName>, <Password> and <ConfirmPassword> clicks register button
    Then register validation error <ValidationMsg> appears at location <Location>
    
    Examples: 
      | UserName  | Password 	| ConfirmPassword | ValidationMsg 							| Location 	|
      |     	    |     	    | 								| Please fill out this field. | Username 	|
      | username1 |     	 	  | 								| Please fill out this field. | Password1	|
			|     			| Password1 | Password1 			| Please fill out this field. | Username 	|
			|     			|  					| Password1 			| Please fill out this field. | Username 	|
			| username1	|  					| Password1 			| Please fill out this field. | Password1 |
			| username1	| Password1	|           			| Please fill out this field. | Password2 |
			

  @register-complete-input-pass
  Scenario Outline: Validate register with complete input
    When user enters <UserName>, <Password> and <ConfirmPassword> clicks register button
    Then user gets register <AlertMessage>
    
    Examples: 
      | UserName  				| Password 		| ConfirmPassword | AlertMessage 														| 
      | Pooja@NumpyNinja  | RT56YU@78 	| RT56YU@78				| Invalid Username and Password						| 