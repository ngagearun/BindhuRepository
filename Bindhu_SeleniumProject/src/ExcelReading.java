import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReading {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");		
		int tot_rows=sh.getLastRowNum();
		int tot_cols=sh.getRow(4).getLastCellNum();       
		
		for(int i=0;i<tot_rows;i++){
			
			XSSFRow row=sh.getRow(i);
		
			for(int j=0;j<tot_cols;j++){
					XSSFCell cell=row.getCell(j);
					String value=cell.getStringCellValue();
					System.out.println(value);
			
		}
			
		}
		
		
		
		/*XSSFRow row=sh.getRow(2);
		 XSSFCell col=row.getCell(1);
		 String value=col.getStringCellValue();
		 System.out.println(value);*/
		 
		 wb.close();
		 fi.close();

	}

}
