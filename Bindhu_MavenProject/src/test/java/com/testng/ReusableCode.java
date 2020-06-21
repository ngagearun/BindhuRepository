package com.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ReusableCode {
	
	
	static WebDriver driver;
	static Select select;
	static Actions action;
	static JavascriptExecutor js;
	@Parameters("browsername")
	@BeforeTest(groups={"regression","smoke","sanity"})
	public void launchbrowserwithapp(String browsername){
		
		if(browsername.equalsIgnoreCase("chrome")){
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
    		 driver=new ChromeDriver();
    		 driver.manage().window().maximize();
    		}else if(browsername.equalsIgnoreCase("firefox")){
    			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
    			 driver=new FirefoxDriver();
    		}
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.mortgagecalculator.org/");
		
	}	
	
	@AfterSuite(groups={"regression","smoke","sanity"})
	public void closebrowser(){
		driver.quit();
	}
	
	public void mouseHoverActions(By ele){
		try{
			action=new Actions(driver);
			action.moveToElement(driver.findElement(ele)).perform();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void clickonlinkElement(By ele){
		
		try{
		driver.findElement(ele).click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void selectdrpdown(By ele,String value){
		try{
		select=new Select(driver.findElement(ele));
		select.selectByVisibleText(value);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sendKeys(By ele,String text){
		try{
			driver.findElement(ele).clear();
			driver.findElement(ele).sendKeys(text);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
   public boolean checkelementdisplayed(By ele){
	   boolean status=false;
	   try{
		  status= driver.findElement(ele).isDisplayed();		   
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   return status;
   }
   
   public String readTextforWebElement(By ele){
	  
   String text=null;
	   try{
		 text=driver.findElement(ele).getText();  
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   return text;
   }
   
   
   public void ScrollBar(By ele){
	   try{
		   
	   js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(ele));
	   }catch(Exception e){
		 e.printStackTrace();  
	   }
   }

   public void switchtoframebyIndex(int index){
	   try{
		   driver.switchTo().frame(index);
		   
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   
   }
   
   
   public void autopopulate(By ele,String value){
	   try{
	   List<WebElement> values=driver.findElements(ele);
	   System.out.println("The no of values is:  "+values.size());
		for(int i=0;i<values.size();i++){
			String text=values.get(i).getText();
			if(text.equalsIgnoreCase(value)){
				values.get(i).click();
				break;
			}
		}
	   }
	catch(Exception e){
		e.printStackTrace();
	}
   }
   
   public String[][] getDataFromExcel(String path, String sheetname) throws IOException {
		String arr[][]=null;
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet(sheetname);		
		int tot_rows=sh.getLastRowNum();
		int tot_cols=sh.getRow(4).getLastCellNum();       
		arr=new String[tot_rows][tot_cols];
		for(int i=1;i<tot_rows;i++){
			
			XSSFRow row=sh.getRow(i);
		
			for(int j=0;j<tot_cols;j++){
					XSSFCell cell=row.getCell(j);
					arr[i-1][j]=cell.getStringCellValue();
			
		}
			
		}
		return arr;
	}
}
