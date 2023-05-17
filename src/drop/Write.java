package drop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write {

	public static void main(String[] args) throws IOException, Exception {
	 
		 File src=new File("C:\\Users\\sp21440\\Desktop\\kiru.xlsx"); 
	        FileInputStream fis = new FileInputStream(src);
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        XSSFSheet Sheet5 = wb.getSheetAt(0);
	        int rc = Sheet5.getLastRowNum();
	        for (int i = 0; i <= rc; i++) {
	            String name = Sheet5.getRow(i).getCell(0).getStringCellValue();
	            System.out.println(name);
	            
	            
	            
	            
	            
//		  // FileInputStream fis=new FileInputStream(src);
//		   XSSFWorkbook wb=new XSSFWorkbook(src);
//			  
//		    XSSFSheet sheet=wb.getSheetAt(0);		   
//		   System.out.println(sheet.getLastRowNum());
//		   sheet.getRow(1).createCell(1).setCellValue("saibaba");
//		   FileOutputStream fos=new FileOutputStream(src);
//              
////		   sheet.getRow(1).createCell(1).setCellValue("saibaba");
//		  
//		   wb.write(fos);
//		   fos.close();
		// TODO Auto-generated method stub

	}

	}}
