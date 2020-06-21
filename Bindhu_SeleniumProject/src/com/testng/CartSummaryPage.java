package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartSummaryPage  extends ReusableCode {
	
	@Test(groups="smoke")
	public void verifyinitialcartsummarypage(){
		clickonlinkElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a"));
		String expectedvalue=readTextforWebElement(By.xpath("//*[@id='center_column']/p"));
		Assert.assertEquals(expectedvalue, "Your shopping cart is empty.");
	}

	
}
