package com.seleniumprogramm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
		launchapp("https://www.bing.com/","chrome");
		Thread.sleep(3000);
		boolean status=driver.findElement(By.id("b_logo")).isDisplayed();
		if(status==true){
			System.out.println("Element is preset");
		}else{
			System.out.println("Elemement not present");
		}

		
		
	}

}
