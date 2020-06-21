package com.seleniumprogramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends Reusable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		launchapp("http://only-testing-blog.blogspot.com/2014/06/alert_6.html","chrome");
		WebDriverWait objname=new WebDriverWait(driver, 10);
		objname.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.close();
		
		

	}

}

