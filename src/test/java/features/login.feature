#hit ctrl+shift+s for proper formatting
# 1. Data Driven Test - Single set of value
# 2. Data Driven Test - multiple set of value
Feature: Facebook login feature

@smokeTest
Scenario: Facebook login Test scenario

	Given User is already on login page
	When Page title is facebook
	Then user enters "shesingh@gmail.com" and "Pravar123"
	Then user clicks on login button
	And user in on homepage
	
	
@RegressionTest
Scenario Outline: Facebook login Test scenario

	Given User is already on login page
	When Page title is facebook
	Then user enters "<username>" and "<password>"
	Then user clicks on login button
	And user in on homepage
	Then user close the browser
	
Examples:
	| username	|	password	|
	| shesingh@gmail.com	|	Pravar123	|	
	| tom16ty@gmail.com	|	a123	|	
