package com.seleniumprogramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		
		/*launchapp("https://www.flipkart.com/", "chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement camera=driver.findElement(By.linkText("Canon DSLR"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", camera);
		driver.findElement(By.linkText("Canon DSLR")).click();
		driver.close();*/
		
		launchapp("http://only-testing-blog.blogspot.com/", "chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement lastname=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[11]/div/div/div/div[2]/div[1]/form/input[2]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('disabled');", lastname);
		
		lastname.sendKeys("arun");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}
	

}
