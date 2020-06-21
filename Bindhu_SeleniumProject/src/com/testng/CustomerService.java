package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerService extends ReusableCode {	
	
	@Test(groups="regression")
	public void customerservice_through_contactuspage(){
		clickonlinkElement(By.linkText("Contact us"));
		selectdrpdown(By.id("id_contact"),"Customer service");
		sendKeys(By.id("email"), "test@gmail.com");
		sendKeys(By.id("id_order"), "1234567");
		sendKeys(By.id("message"),"Hello please look into my oder");
		clickonlinkElement(By.xpath("//*[@id='submitMessage']/span"));
		boolean verifytextmessage=checkelementdisplayed(By.xpath("//*[@id='center_column']/p"));
		Assert.assertTrue(verifytextmessage, "Element is displayd");
	}
	
	

}
