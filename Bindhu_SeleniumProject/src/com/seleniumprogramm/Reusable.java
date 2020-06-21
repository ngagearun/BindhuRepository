package com.seleniumprogramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusable {

	static WebDriver driver;
	
    public static void launchapp(String url,String browsername){
    	if(browsername.equalsIgnoreCase("chrome")){
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
    		 driver=new ChromeDriver();
    		}else if(browsername.equalsIgnoreCase("firefox")){
    			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
    			 driver=new FirefoxDriver();
    		}
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get(url);
   }
    
    
   
    
    
}
