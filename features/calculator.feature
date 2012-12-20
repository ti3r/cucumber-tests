Feature: Calculator ops

Background:
	Given I reset the calculator

@all
Scenario: Add and check result
	When I add 3 to the calculator
	And I add 6 to the calculator
	Then result should be 9
	
#test with place holders and outlines
@all
Scenario Outline: stress test of adding
	When I add <num1> to the calculator
	And I add <num2> to the calculator 
	Then result should be <result>
	
	Examples:
		|num1	|num2	|result	|
		|1		|2		|3		|
		|5		|6		|11		|
		|1		|5		|6		|
		