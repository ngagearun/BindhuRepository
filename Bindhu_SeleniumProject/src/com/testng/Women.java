package com.testng;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Women extends ReusableCode {
	
	@BeforeClass(groups={"regression","smoke"})
	public void movetoDressespage() throws InterruptedException{
		mouseHoverActions(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		clickonlinkElement(By.linkText("T-shirts"));	
	}
	
	@Test(priority=3,groups="sanity")
	public void verifytitlenameTshirts(){
		
		String expectedvalue=readTextforWebElement(By.className("cat-name"));
		Assert.assertEquals(expectedvalue, "T-SHIRTS ");
	}
	
	@Test(priority=4,groups="regression")
	public void AddTshirtstocart() throws InterruptedException{
	
		ScrollBar(By.className("available-now"));
		mouseHoverActions(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		clickonlinkElement(By.xpath("//*[text()='Add to cart']"));
		Thread.sleep(5000);
		String expectedvalue=readTextforWebElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"));
		Assert.assertEquals(expectedvalue, "Product successfully added to your shopping cart");
		clickonlinkElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span"));
	}

	@Test(priority=5,groups="smoke")
	public void AddTShirtthroughQuickView(){
		ScrollBar(By.className("available-now"));
		mouseHoverActions(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		clickonlinkElement(By.xpath("//*[text()='Quick view']"));
		switchtoframebyIndex(0);
    	clickonlinkElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
    	clickonlinkElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span"));

	}
}
