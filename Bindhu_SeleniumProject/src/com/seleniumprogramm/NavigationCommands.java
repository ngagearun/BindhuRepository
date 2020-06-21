package com.seleniumprogramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands extends Reusable{

	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		launchapp("", "chrome");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.linkText("Downloads")).click();
		
		driver.findElement(By.linkText("Projects")).click();
		
		driver.findElement(By.linkText("Documentation")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		String url=driver.getCurrentUrl();
		driver.get(url);
		
		
		driver.navigate().to(url);
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Documentation")).sendKeys(Keys.F5);
		
		driver.close();
		
		
		
		
		
		

	}

}
