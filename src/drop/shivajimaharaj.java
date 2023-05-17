package drop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shivajimaharaj {
public static void main(String[] args) throws IOException {
	  FileInputStream fis = new FileInputStream("C:\\Users\\sp21440\\Desktop\\kiru.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheetAt(0);
	      int num = sh.getLastRowNum();
	      System.out.println(num);
	      for(int i=0;i<=num;i++) {
	    	  String un=sh.getRow(0).getCell(i).getStringCellValue();
              String pwd=sh.getRow(1).getCell(i).getStringCellValue();
              System.out.println(un+""+pwd);
              WebDriver d=new ChromeDriver();
              d.manage().window().maximize();
              d.get("https://adactinhotelapp.com/");
              d.findElement(By.id("username")).sendKeys("revanchinna");
              d.findElement(By.id("password")).sendKeys("Chinna@143");
              d.findElement(By.id("login")).click();
	      }
}

}
