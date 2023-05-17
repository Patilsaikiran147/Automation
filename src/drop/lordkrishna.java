package drop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lordkrishna {
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static XSSFWorkbook wb;
	public static FileInputStream fis;
	public static File src;

	public void launchapp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}

	public void login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("login_button")).click();
	}

	public void logout() {
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
		driver.close();
	}

	public int getrowcount(String xlpath, int sheetid) throws IOException {
		File src = new File("C:\\Users\\sp21440\\Desktop\\kiru.xlsx");
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	public String getdata(int rowindex, int colindex) {
		String data = sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}

	public static void main(String[] args) throws Exception {
		lordkrishna obj = new lordkrishna();
		int rowcount= obj.getrowcount("C:\\Users\\sp21440\\Desktop\\kiru.xlsx", 0);
		System.out.println(rowcount);
		System.out.println();
		for (int i = 0; i <= rowcount; i++) {
			String un = obj.getdata(i, 0);
			String pwd = obj.getdata(i, 1);
			System.out.println(un + "   " + pwd);
			obj.launchapp();
			obj.login(un, pwd);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement message = driver.findElement(By.id("location"));
			for (int j = 0; j <= rowcount; j++) {
				XSSFCell cell = sheet.getRow(i).createCell(2);

				if (message.isDisplayed()) {
					cell.setCellValue("Pass");
				} else {
					cell.setCellValue("Fail");
				}
			}
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sp21440\\Desktop\\kiru.xlsx");
		wb.write(fos);
		obj.logout();
	}

}
