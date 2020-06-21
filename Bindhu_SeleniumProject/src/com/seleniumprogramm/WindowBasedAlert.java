package com.seleniumprogramm;

import java.io.IOException;

import org.openqa.selenium.By;

public class WindowBasedAlert  extends Reusable{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		launchapp("http://only-testing-blog.blogspot.com/","chrome");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\BindiAutoITScript.exe");

	}

}
