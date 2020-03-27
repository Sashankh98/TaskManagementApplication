Feature: open the browser 
	In order to open to the website
		As a task manager
		I want to print the tasks list
Background: 
	Given I have browser 'ch' with Task Management website 
	
Scenario: Printing TaskList 

	When I open the browser and click on the Task List Icon 
	Then I should get the details of the tasks 
	
Scenario: Logging the application with valid credentials 

	When I click on Administration icon and i enter username as 'admin' and password as 'admin' 
	Then I should access the portal with title as 'Administration' 
	
Scenario: printing Employees List 

	When I click on Administration icon and i enter username as 'admin' and password as 'admin' 
	And  I click on Employees 
	Then I should get the details of the all the Employees 
	
Scenario: addingProjectsTest 

	When I enter Project as  'New Project' and clicking add button 
	Then 'New Project' should be added in the Project List 
	
Scenario Outline: Searching Task by Assisgned name 

	When I enter data '<Assigned To>' 
	And Click on search button 
	Then I should get the results 
	Examples: 
		|Assigned To|
		|Ken Price|
