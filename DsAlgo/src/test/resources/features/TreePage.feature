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
@dsalgo-tree
Feature: Validate Tree Page

	Background: User is in home page and signed in
		Given user is in sign in page
		When user enters valid username and password
		Then user is signed in and redirected to home page with alert message "You are logged in"
		


 	@tree-page-links
 	Scenario Outline: Validate whether topic links work in tree page
 		Given user is in tree page
    When user clicks tree page topic link <TopicLink> 
    Then user is redirected to tree topic page with title <TopicLink>
    When user clicks try here in tree page
    Then user is redirected to editor page having run button with text "Run"
  	When user enters the valid code <ValidCode>
    Then user should be presented with Run result
    When user enters invalid code <InvalidCode>
    Then The user should be presented with error message
    When user clicks signout link
		Then user is signed out and redirected to home page with alert message "Logged out successfully"
    
    
    Examples: 
      | TopicLink   									| ValidCode 						 | InvalidCode							|
#      | Overview of Trees							|	print('Hello, world!') | printx('Hello, world!')	|
#      | Terminologies						      | print('Hello, world!') | printx('Hello, world!')	|
#      |	Types of Trees 						    | print('Hello, world!') | printx('Hello, world!')  |
#      | Tree Traversals	              | print('Hello, world!') | printx('Hello, world!')	|	
      |	Traversals-Illustration			| print('Hello, world!') | printx('Hello, world!')	|
#      | Binary Trees 									|	print('Hello, world!') | printx('Hello, world!')  |
#      | Types of Binary Trees				  |	print('Hello, world!') | printx('Hello, world!')	|			
#      |	Implementation in Python			| print('Hello, world!') | printx('Hello, world!')  |
#			| Binary Tree Traversals        | print('Hello, world!') | printx('Hello, world!')   |
#			| Implementation of Binary Trees| print('Hello, world!') | printx('Hello, world!')   |
#			| Applications of Binary trees  | print('Hello, world!') | printx('Hello, world!')   |
#			| Binary Search Trees 					| print('Hello, world!') | printx('Hello, world!')   |
#			| Implementation Of BST 				| print('Hello, world!') | printx('Hello, world!')   |
			
