package com.seleniumprogramm;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class RobotHandling  extends Reusable{

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		launchapp("https://www.mortgagecalculator.org/","chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Actions action=new Actions(driver);
        action.contextClick().perform();
        Thread.sleep(5000);
        Robot r=new Robot();
        r.keyPress( KeyEvent.VK_DOWN);
        r.keyPress( KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease( KeyEvent.VK_DOWN);
        r.keyRelease( KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(6000);
        driver.close();
        

	}

}
