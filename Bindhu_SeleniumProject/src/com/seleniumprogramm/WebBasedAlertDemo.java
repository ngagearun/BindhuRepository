package com.seleniumprogramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebBasedAlertDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
		launchapp("http://only-testing-blog.blogspot.com/","chrome");
		Thread.sleep(5000);
		WebElement confirmation_button=driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[1]"));
		confirmation_button.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();

	}

}
