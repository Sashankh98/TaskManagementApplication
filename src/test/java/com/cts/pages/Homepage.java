package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	public WebDriver driver;
	public By taskLoc = By.xpath("//img[@src='images/task-list-button.gif']");
	public By administratorLoc = By.xpath("//img[@src='images/administration-button.gif']");
	public By assinedToLoc = By.name("assign_to");
	public By searchLoc = By.name("DoSearch");
	public  By resultLoc = By.className("Grid");

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicOnTaskList() {
		// clicking task icon
		driver.findElement(taskLoc).click();

	}

	public void clickOnAdministrator() {
		// clicking administrator icon
		driver.findElement(administratorLoc).click();
	}
	public void selectAssignedTo(String assinedTo) {

		Select select = new Select(driver.findElement(assinedToLoc));
		select.selectByVisibleText(assinedTo);
	}
	public void clickOnSearch() {

		driver.findElement(searchLoc).click();
	}
	public String getResults() {

		return driver.findElement(resultLoc).getText();
	}


}
