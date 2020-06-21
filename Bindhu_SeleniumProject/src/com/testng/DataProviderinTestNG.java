package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderinTestNG extends ReusableCode {

	
	@Test(dataProvider="calculate",groups={"regression"})
	public void calculateinteest(String homevalue,String downpayent,String loanamt,String interestrate){
		
		sendKeys(By.id("homeval"), homevalue);
		sendKeys(By.id("downpayment"),downpayent);
		sendKeys(By.id("loanamt"), loanamt);
		sendKeys(By.id("intrstsrate"), interestrate);
		clickonlinkElement(By.name("cal"));
		}	
	
	@DataProvider(name="calculate")
	public String[][] getMethod() throws IOException{
		String arr[][]=getDataFromExcel("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx","Sheet1");		           
		return arr;
	}
	


	
		
}
