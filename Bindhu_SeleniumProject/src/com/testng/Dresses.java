package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dresses  extends ReusableCode{
	
	@BeforeClass(groups={"regression","smoke"})
	public void movetoDressespage() throws InterruptedException{
		mouseHoverActions(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
		Thread.sleep(3000);
		clickonlinkElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a"));	
	}
	
	@Test(priority=1,groups="smoke")
	public void verifyTitlepageonEveningDresses() throws InterruptedException{		
		String expectedvalue=readTextforWebElement(By.className("cat-name"));
		Assert.assertEquals(expectedvalue, "EVENING DRESSES ");
	}
	
	@Test(priority=2,groups="regression")
	public void addEveningDressesthroughMore() throws InterruptedException{
		
		ScrollBar(By.className("available-now"));
		mouseHoverActions(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		clickonlinkElement(By.xpath("//*[text()='More']"));
		sendKeys(By.id("quantity_wanted"), "5");
		selectdrpdown(By.name("group_1"), "M");
		clickonlinkElement(By.xpath("//*[text()='Add to cart1']"));
		Thread.sleep(5000);
		String expectedvalue=readTextforWebElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"));
		Assert.assertEquals(expectedvalue, "Product successfully added to your shopping cart");
		clickonlinkElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span"));
	}
	
	

}
