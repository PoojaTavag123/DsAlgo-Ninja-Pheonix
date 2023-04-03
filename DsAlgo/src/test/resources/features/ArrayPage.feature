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
@dsalgo-array-page
Feature: Validate Array Page

	Background: User is in home page and signed in
		Given user is in sign in page
		When user enters valid username and password
		Then user is signed in and redirected to home page with alert message "You are logged in"
		
 	@array-page-links
 	Scenario Outline: Validate whether topic links work in Array page
 		Given user is in array page
    When user clicks array page topic link <TopicLink> 
    Then user is redirected to array topic page with titile <TopicLink>
    When user clicks try here in array page 
    Then user is redirected to editor page having run button with text "Run"
  	When user enters the valid code <ValidCode>
    Then user should be presented with Run result
    When user enters invalid code <InvalidCode>
    Then The user should be presented with error message
    When user clicks signout link
		Then user is signed out and redirected to home page with alert message "Logged out successfully"
    
    Examples: 
      | TopicLink   								| ValidCode 							| InvalidCode							|
      | Arrays in Python						|	print('Hello, world!') | printx('Hello, world!')	|
      | Arrays Using List					  | print('Hello, world!') | printx('Hello, world!')	|
      | Basic Operations in Lists		| print('Hello, world!') | printx('Hello, world!')	|
      | Applications of Array 			| print('Hello, world!') | printx('Hello, world!')	|

