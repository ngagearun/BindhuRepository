package com.seleniumprogramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverActions extends Reusable {

	public static void main(String[] args) throws InterruptedException {

		launchapp("https://www.flipkart.com/","chrome");
		Thread.sleep(5000);		
		WebElement electronics =driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));		
		Actions action=new Actions(driver);
		action.moveToElement(electronics).perform();
		Thread.sleep(3000);
        driver.findElement(By.linkText("Mi")).click();
        Thread.sleep(3000);
        String actualtext=driver.findElement(By.className("_2yAnYN")).getText();
        if(actualtext.equalsIgnoreCase("Mi Mobiles")){
        	System.out.println("It is showing MI Mobile page");
        }else{
          System.out.println("It is not in MI mobbile page");	
        }
        
        Thread.sleep(3000);
        WebElement price_list= driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
        
        Select objname=new Select(price_list);
        objname.selectByIndex(2);
        Thread.sleep(3000);
        objname.selectByValue("13000");
        Thread.sleep(3000);
        objname.selectByVisibleText("₹25000");
        Thread.sleep(3000);
        driver.close();
        
        
        
	}

}
