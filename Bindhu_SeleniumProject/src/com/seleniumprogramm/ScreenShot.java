package com.seleniumprogramm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot extends Reusable {

	public static void main(String[] args) throws IOException {
		
		launchapp("https://www.mortgagecalculator.org/", "chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot tc=(TakesScreenshot) driver;
		File fi=tc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fi, new File("D:\\Takescreenshot.png"));
		driver.close();

	}

}
