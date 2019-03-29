#Example Keyword
Feature: FreeCRM create contacts

Scenario Outline: FreeCRM create new contacts scenario

	Given User is already on FreeCRM login page
	When Page title is Free CRM
	Then User enters "<username>" and "<password>"
	Then User clicks on login button
	Then User in on homepage
	Then User moves to new contacts
	Then User enters "<firstname>" and "<lastname>" and "<position>"
	Then User closes the browser
	
Examples:
	| username | password | firstname | lastname | position |
	| shesingh@gmail.com | Pravar123 | Shefali | Singh | Manager |