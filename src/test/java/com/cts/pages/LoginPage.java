package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private By userNameLoc = By.xpath("//input[@name='login']");
	private By passWordLoc = By.xpath("//input[@name='password']");
	private By loginButtonLoc = By.xpath("//input[@name='DoLogin']");
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {

		// sending userName credentials
		driver.findElement(userNameLoc).sendKeys(username);
	}

	public void enterPassWord(String password) {

		// sending password credentials
		driver.findElement(passWordLoc).sendKeys(password);
	}

	public void clickOnLogin() {

		// clicking on login button
		driver.findElement(loginButtonLoc).click();
	}

}
