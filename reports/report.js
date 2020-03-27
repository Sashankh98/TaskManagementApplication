$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/PrintTaskList.feature");
formatter.feature({
  "name": "open the browser",
  "description": "\tIn order to open to the website\n\t\tAs a task manager\n\t\tI want to print the tasks list",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Printing TaskList",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open the browser and click on the Task List Icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_open_the_browser_and_click_on_the_Task_List_Icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the tasks",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_should_get_the_details_of_the_tasks()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logging the application with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Administration icon and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_click_on_Administration_icon_and_i_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access the portal with title as \u0027Administration\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_should_access_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "printing Employees List",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Administration icon and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_click_on_Administration_icon_and_i_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Employees",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_click_on_Employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the all the Employees",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_should_get_the_details_of_the_all_the_Employees()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "addingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter Project as  \u0027New Project\u0027 and clicking add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_enter_Project_as_and_clicking_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Project\u0027 should be added in the Project List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.should_be_added_in_the_Project_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Searching Task by Assisgned name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data \u0027\u003cAssigned To\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "I should get the results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Assigned To"
      ]
    },
    {
      "cells": [
        "Ken Price"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching Task by Assisgned name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data \u0027Ken Price\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_enter_data(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintStepDefinition.i_should_get_the_results()"
});
formatter.result({
  "status": "passed"
});
});