Feature: Calculator ops

Background:
	Given I reset the calculator

@all
Scenario: Add and check result
	When I add 3 to the calculator
	And I add 6 to the calculator
	Then result should be 9
	
	