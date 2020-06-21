package com.seleniumprogramm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoComplete extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		
		launchapp("https://jqueryui.com/autocomplete/", "chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("A");
		WebElement autocomplete=driver.findElement(By.id("ui-id-1"));
		List<WebElement> list=autocomplete.findElements(By.tagName("li"));
		for(int i=0;i<list.size();i++){
			String value=list.get(i).getText();
			if(value.equalsIgnoreCase("BASIC")){
				list.get(i).click();
				break;
			}
		}
       Thread.sleep(4000);
		driver.close();
	}

}
