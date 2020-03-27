package com.cts.base;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public WebDriver driver;

	public ScreenShots(WebDriver driver) {
		this.driver = driver;
	}
	public void screenshot(String name) {

		Date date = new Date();
		String dateStr = date.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);

		file.renameTo(new File("src/test/resources/screenshot" + dateStr + name + ".png"));
	}

}
