package com.seleniumprogramm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectableDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
		launchapp("https://jqueryui.com/selectable/","chrome");
		Thread.sleep(3000);
        driver.switchTo().frame(0);
        
        WebElement item1=driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
        WebElement item3=driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
        WebElement item4=driver.findElement(By.xpath("//*[@id='selectable']/li[4]"));
        WebElement item5=driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
        
        Actions action=new Actions(driver);
        action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item4).click(item5).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
