package com.cts.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintingList {

	public By tableLoc = By.xpath(" //table[@class='Grid']//tbody//tr");
	public WebDriver driver;

	public PrintingList(WebDriver driver) {
		this.driver = driver;
	}

	public void printList() {
		List<WebElement> allRows = driver.findElements(tableLoc);

		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (WebElement cellData : cells) {
				// printing cell data
				System.out.print(cellData.getText() + "  ");

			}
			System.out.println();
			System.out.println();
		}

	}
}
