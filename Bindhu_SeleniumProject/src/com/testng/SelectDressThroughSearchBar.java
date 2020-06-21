package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDressThroughSearchBar extends ReusableCode{
	
	@Test(priority=6,groups="smoke")
	public void selectdress() throws InterruptedException{
		Thread.sleep(3000);
		sendKeys(By.id("search_query_top"), "Dresses");
		Thread.sleep(3000);
	    autopopulate(By.xpath("//*[@id='index']/div[2]/ul/li"), "Summer Dresses > Printed Chiffon Dress");
	    sendKeys(By.id("quantity_wanted"), "5");
		selectdrpdown(By.name("group_1"), "M");
		clickonlinkElement(By.xpath("//*[text()='Add to cart']"));
		Thread.sleep(5000);
		String expectedvalue=readTextforWebElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"));
		Assert.assertEquals(expectedvalue, "Product successfully added to your shopping cart");
	}
	
	

}
