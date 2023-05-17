//package drop;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.FillPatternType;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DDTwithMethod {
//	public static WebDriver driver;
//	public static XSSFSheet sheet;
//	public static XSSFWorkbook wb;
//	public static FileInputStream fis;
//	public static File src;
//
//	public void launchapp() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
//	}
//
//	public void login(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.className("login_button")).click();
//	}
//
//	public void logout() {
//		driver.findElement(By.partialLinkText("Logout")).click();
//		driver.close();
//	}
//
//	public static int getrowcount(String xlpath, int sheetid) throws IOException {
//		File src = new File(xlpath);
//		fis = new FileInputStream(src);
//		wb = new XSSFWorkbook(fis);
//		sheet = wb.getSheetAt(sheetid);
//		int rc = sheet.getLastRowNum();
//		return rc;
//	}
//
//	public String getdata(int rowindex, int colindex) {
//		String data = sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
//		return data;
//	}
//
//	public static void main(String[] args) {
//	
//                        DDTwithMethod obj= new DDTwithMethod();
//              int rowcount= obj.getrowcount("C:\\Users\\am21393\\Desktop\\testdata1.xlsx", 0);
//              System.out.println(rowcount);
//              for(int i= 0; i<= rowcount; i++) { 
//	           String un= obj.getdata(i, 0);
//	          String pwd=obj.getdata(i, 1);
//	          System.out.println(un+ "   "+ pwd);
//	          obj.launchapp();
//	          obj.login(un, pwd);
//	          Thread.sleep(2000);
//	           WebElement message=driver.findElement(By.xpath("//a[text()='Logout']"));
//
//	        CellStyle style = wb.createCellStyle();
//	        style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
//	        style.setFillPattern(FillPatternType.FINE_DOTS);
//
//	        CellStyle style1 = wb.createCellStyle();
//	        style1.setFillBackgroundColor(IndexedColors.RED.getIndex());
//	        style1.setFillPattern(FillPatternType.FINE_DOTS);
//              
//	          for(int j= 0; j<=rowcount; j++)
//	            {
//	                XSSFCell cell=sheet.getRow(i).createCell(2);
//
//	                if(message.isDisplayed())
//	                {
//
//	                    cell.setCellValue("Pass");
//	                    cell.setCellStyle(style);
//
//	                }
//	                else {
//
//	                    cell.setCellValue("Fail");
//	                    cell.setCellStyle(style1);
//	            }
//              }
//              }
//	        FileOutputStream fos=new FileOutputStream("C:\\Users\\am21393\\Desktop\\testdata1.xlsx");
//	        wb.write(fos);
//	        obj.logout();
//	        }
//}
//	
//	
//	
//
//
//      
