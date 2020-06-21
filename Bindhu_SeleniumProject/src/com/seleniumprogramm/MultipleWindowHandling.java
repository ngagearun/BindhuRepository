package com.seleniumprogramm;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class MultipleWindowHandling extends Reusable{

	public static void main(String[] args) {
		
		launchapp("https://candidate.psiexams.com/index.jsp", "chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String mainwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("PSI Bookstore")).click();
		Set<String> no_of_windows=driver.getWindowHandles();
		System.out.println(no_of_windows.size());
		
	
		
		for(String handles:no_of_windows){
			
			if(!handles.equalsIgnoreCase(mainwindow)){
				driver.switchTo().window(handles);
				driver.findElement(By.id("search_queryispbxi_")).sendKeys("Rellllald");
			}			
		}		
         driver.close();
         driver.switchTo().window(mainwindow);
         driver.findElement(By.name("emailid")).sendKeys("test@gmaail.com");
         driver.quit();
	}

}
