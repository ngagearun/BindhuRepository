package com.seleniumprogramm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMortGageApp extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	
		launchapp("https://www.mortgagecalculator.org/","chrome");
		String titlename=driver.getTitle();
		if(titlename.equalsIgnoreCase("Mortgage Calculator")){
			System.out.println("The app is mortgage");
		}
		driver.findElement(By.id("homeval")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).sendKeys("300000");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
        driver.close();
	}

}
