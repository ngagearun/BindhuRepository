package com.seleniumprogramm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintingDropDownValues extends Reusable {

	public static void main(String[] args) throws IOException {
		

		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("WritingData");
		
		launchapp("https://www.mortgagecalculator.org/", "chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement month=driver.findElement(By.name("param[start_month]"));
		List<WebElement> month_dropdown=month.findElements(By.tagName("option"));
		System.out.println(month_dropdown.size());
		for(int i=0;i<month_dropdown.size();i++){
		sh.createRow(i).createCell(2).setCellValue(month_dropdown.get(i).getText());

		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
	    wb.write(fo);
		
  driver.close();
	}

}
