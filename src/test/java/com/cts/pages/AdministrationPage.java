package com.cts.pages;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AdministrationPage {

	public By employeeLoc = By.linkText("Employees");
	public By prioritiesLoc = By.linkText("Priorities");
	public By projectLoc = By.linkText("Projects");
	public By statusesLoc = By.linkText("Statuses");
	public By typesLoc = By.linkText("Types");
	public  By logoutLoc = By.linkText("Logout");

	public WebDriver driver;

	public AdministrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnEmployees() {
		// clicking on employee
		driver.findElement(employeeLoc).click();

	}

	public void clickOnPriorities() {
		// clicking on priorities
		driver.findElement(prioritiesLoc).click();

	}

	public void clickOnProjects() {
		// clicking on project
		driver.findElement(projectLoc).click();

	}

	public void clickOnStatuses() {
		// clicking on statuses
		driver.findElement(statusesLoc).click();

	}

	public void clickOnTypes() {
		// clicking on types
		driver.findElement(typesLoc).click();

	}
	public void clickOnLogout() {
		driver.findElement(logoutLoc).click();
	}

	
	

}
