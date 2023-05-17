package ExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_pp {
	static WebDriver driver;
	static  XSSFWorkbook wb;
	static XSSFSheet sh;
	static  XSSFRow row;
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@DataProvider(name = "excel-data")
	public Object[][] excelDP() throws IOException {
		Object[][] arrObj = getExcelData("C:\\Users\\sp21440\\Desktop\\DataproviderSheet.xlsx");
		return arrObj;
	}

	public String[][] getExcelData(String fileName ) throws IOException{           
           String[][] data = null;       
           try
           {
            FileInputStream fis = new FileInputStream("C:\\Users\\sp21440\\Desktop\\DataproviderSheet.xlsx");
             wb = new XSSFWorkbook(fis);
             sh = wb.getSheetAt(0);
             row = sh.getRow(0);
            int noOfRows = sh.getLastRowNum();
            int noOfCols = row.getLastCellNum(); 
            System.out.println("noOfRows:"+noOfRows);
            System.out.println("noOfCols"+noOfCols);
            Cell cell;
            data = new String[noOfRows-1][noOfCols];
            for(int i =1; i<noOfRows;i++){
              for(int j=0;j<noOfCols;j++){
                    row = sh.getRow(i);
                    cell= row.getCell(j);   
                    System.out.println(cell);
                    data[i-1][j] = cell.getStringCellValue();
                    }
            }
           }
           catch (Exception e) {
                 System.out.println("The exception is: " +e.getMessage());
                             }
           return data;
     }

	@Test(dataProvider = "excel-data")
	public void login(String Un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(Un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		Reporter.log("login is successful", true);
		Assert.assertEquals(driver.findElement(By.className("logo")).isDisplayed(),true);
	}

	@AfterMethod()
	public void closebrowser() {
		driver.close();

	}
}