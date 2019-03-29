#Data table with Maps object - is useful if we want to rerun any step multiple time instead of complete scenario.
#In Examples Keyword it run complete scenario. 
Feature: FreeCRM create Deal

Scenario: FreeCRM create new deal scenario

	Given User is already on FreeCRM login page
	When Page title is Free CRM
	Then User enters username and password
	| username | password|
	| shesingh@gmail.com | Pravar123 |
	| shesingh32@gmail.com | P123 |
	Then User clicks on login button
	Then User in on homepage
	Then User moves to new deal page
	Then User enters title and amount and commision
	| title 		| amount | commision|
	| test deal 	| 1000	 | 10|
	| test deal2 	| 2000	 | 20|
	| test deal3 	| 3000	 | 30|
# If you want to multiple data like above in data able then  create for loop in step definition because it automatically don't run the step or test for each data set.
	Then User closes the browser