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

public class WebTableDemo extends Reusable {

	public static void main(String[] args) throws IOException {

		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("WritingData");
		
		launchapp("https://money.rediff.com/gainers/bsc/dailygroupa?", "chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement tbody=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> tbody_rows=tbody.findElements(By.tagName("tr"));
		for(int i=0;i<2;i++){
			
			List<WebElement> tbody_cols=tbody_rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<tbody_cols.size();j++){
				if(sh.getRow(i)==null){
				sh.createRow(i).createCell(j).setCellValue(tbody_cols.get(j).getText());
				}else{
					sh.getRow(i).createCell(j).setCellValue(tbody_cols.get(j).getText());	
				}
			}
		}

		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
	    wb.write(fo);
		driver.close();
	}

}
