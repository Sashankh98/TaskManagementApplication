package com.cts.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectListPage {

	
	public By newProjectLoc = By.xpath("//a[text()='Add New Project']");
	public By projectTextLoc = By.xpath("//input[@name='project_name']");
	public By addLoc = By.xpath("//input[@name='Insert']");
	public By submitLoc = By.xpath("//input[@name='Update']");
	public By deleteLoc = By.xpath("//input[@name='Delete']");
	public By tableLoc = By.xpath("//table[@class='Grid']//tbody//tr");
	public WebDriver driver;
	
	public ProjectListPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void addingProject(String projectText)
	{
		driver.findElement(newProjectLoc).click();
		driver.findElement(projectTextLoc).sendKeys(projectText);
		driver.findElement(addLoc).click();
	}

	public void editingProject(String editingProject, String editingText)
	{
		driver.findElement(By.xpath("//a[text()='"+editingProject+"']")).click();
		driver.findElement(projectTextLoc).clear();
		driver.findElement(projectTextLoc).sendKeys(editingText);
		driver.findElement(submitLoc).click();
	}

	public void deletingProject(String deletingProject)
	{
		driver.findElement(By.xpath("//a[text()='"+deletingProject+"']")).click();
		driver.findElement(deleteLoc).click();
	}
	
	public List<String> assertionData()
	{
		List<String> cellData = new ArrayList<String>();
		List<WebElement> rowList = driver.findElements(tableLoc);
		for (WebElement row : rowList) {
			List<WebElement> cellList = row.findElements(By.tagName("td"));
			for (WebElement cell : cellList) {
				String data = cell.getText();
				cellData.add(data);
				System.out.println(cellData);
			}
		}
		return cellData;
	}
}
