package com.seleniumprogramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
		launchapp("https://jqueryui.com/","firefox");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement draggable=driver.findElement(By.id("draggable"));
		
		Actions action =new Actions(driver);
		action.dragAndDropBy(draggable, 110, 131).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
