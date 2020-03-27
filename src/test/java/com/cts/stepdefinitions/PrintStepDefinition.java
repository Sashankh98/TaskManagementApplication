package com.cts.stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

import com.cts.base.LaunchWebDriver;
import com.cts.base.PrintingList;
import com.cts.base.ScreenShots;
import com.cts.excel.ExcelReading;
import com.cts.pages.AdministrationPage;
import com.cts.pages.Homepage;
import com.cts.pages.LoginPage;
import com.cts.pages.ProjectListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintStepDefinition {
	@Given("I have browser {string} with Task Management website")
	public void i_have_browser_with_Task_Management_website(String browserName) {
		// Access Task Management web page
		LaunchWebDriver.setUp(browserName);
	}

	@When("I open the browser and click on the Task List Icon")
	public void i_open_the_browser_and_click_on_the_Task_List_Icon() {
		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);
		LoginPage loginPageObject = new LoginPage(LaunchWebDriver.driver);
		
		//click on administrator
		homePageObject.clickOnAdministrator();
		
		//sending userName "admin"
		loginPageObject.enterUserName("admin");
		
		//sending password "admin"
		loginPageObject.enterPassWord("admin");
		
		//click on login
		loginPageObject.clickOnLogin();
		
		//click on TaskList
		homePageObject.clicOnTaskList();
	}

	@Then("I should get the details of the tasks")
	public void i_should_get_the_details_of_the_tasks() {
		ScreenShots screenShotObject = new ScreenShots(LaunchWebDriver.driver);
		// screenshots
		screenShotObject.screenshot("TaskList");
		
		//printing the list on console
		PrintingList printingListObject = new PrintingList(LaunchWebDriver.driver);
		printingListObject.printList();
		LaunchWebDriver.tearDown();

	}

	@When("I click on Administration icon and i enter username as {string} and password as {string}")
	public void i_click_on_Administration_icon_and_i_enter_username_as_and_password_as(String username,
			String password) {
		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);
		LoginPage loginPageObject = new LoginPage(LaunchWebDriver.driver);
		
		//click on administrator
		homePageObject.clickOnAdministrator();
		
		//sending userName "admin"
		loginPageObject.enterUserName(username);
		
		//sending password "admin"
		loginPageObject.enterPassWord(password);
		
		//click on login
		loginPageObject.clickOnLogin();
	}

	@Then("I should access the portal with title as {string}")
	public void i_should_access_the_portal_with_title_as(String title) {
		String actualTitle = LaunchWebDriver.driver.getTitle();
		
		//Assertion
		Assert.assertEquals(title, actualTitle);
		System.out.println(title);
		
		//closing browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Employees")
	public void i_click_on_Employees() {
		AdministrationPage administrationPageObject = new AdministrationPage(LaunchWebDriver.driver);
		
		//click on enployee
		administrationPageObject.clickOnEmployees();
	}

	@Then("I should get the details of the all the Employees")
	public void i_should_get_the_details_of_the_all_the_Employees() {

		ScreenShots screenShotObject = new ScreenShots(LaunchWebDriver.driver);
		System.out.println("Employees List");

		// screenshots
		screenShotObject.screenshot("EmployeeList");

		//printing the list on console
		PrintingList printingListObject = new PrintingList(LaunchWebDriver.driver);
		printingListObject.printList();
		
		//closing browser
		LaunchWebDriver.tearDown();

	}

	@When("I enter Project as  {string} and clicking add button")
	public void i_enter_Project_as_and_clicking_add_button(String projectText) throws IOException {
		// class objects of pages
		AdministrationPage administrationPageObject = new AdministrationPage(LaunchWebDriver.driver);
		ProjectListPage projectListPage = new ProjectListPage(LaunchWebDriver.driver);
		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);
		LoginPage loginPageObject = new LoginPage(LaunchWebDriver.driver);

		//click on administrator
		homePageObject.clickOnAdministrator();
		
		ExcelReading excelReadingObject = new ExcelReading();
		
		//Reading data from Excel sheet and Storing data into String 
		String[][] data = excelReadingObject.excelread();
		
		//sending userName from String
		loginPageObject.enterUserName(data[0][0]);
		
		//sending password "admin"
		loginPageObject.enterPassWord(data[0][1]);
		
		//click on login
		loginPageObject.clickOnLogin();
		
		//click on administrator
		homePageObject.clickOnAdministrator();

		// Click on project
		administrationPageObject.clickOnProjects();

		// Add project
		projectListPage.addingProject(projectText);
	}

	@Then("{string} should be added in the Project List")
	public void should_be_added_in_the_Project_List(String projectText) {
		// class objects of pages
		AdministrationPage administrationPageObject = new AdministrationPage(LaunchWebDriver.driver);
		ProjectListPage projectListPageObject = new ProjectListPage(LaunchWebDriver.driver);
		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);
		ScreenShots screenShotObject = new ScreenShots(LaunchWebDriver.driver);

		// Assertion
		List<String> cellData = projectListPageObject.assertionData();
		if (cellData.contains(projectText)) {
			Assert.assertTrue("Assertion Failed", cellData.contains(projectText));
		} else {
			Assert.fail("Assertion Failed");
		}
		// screenshots
		screenShotObject.screenshot("project");

		// Click on administration icon
		homePageObject.clickOnAdministrator();

		// Click on logout button
		administrationPageObject.clickOnLogout();

		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@Then("I should get the results")
	public void i_should_get_the_results() {
		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);
		ScreenShots screenShotObject = new ScreenShots(LaunchWebDriver.driver);

		// Get results into string
		String result = homePageObject.getResults();

		// screenshots
		screenShotObject.screenshot("EmployeeList");

		// Print result
		System.out.println(result);

		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I enter data {string}")
	public void i_enter_data(String assinedTo) {
		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);

		// Select assigned to
		homePageObject.selectAssignedTo(assinedTo);
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {

		Homepage homePageObject = new Homepage(LaunchWebDriver.driver);
		// Click on Search
		homePageObject.clickOnSearch();
		Thread.sleep(2000);

	}

}
