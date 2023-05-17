package drop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyword {
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static XSSFSheet sheet1;
	public static XSSFWorkbook wb;
	public static XSSFWorkbook wb1;
	public static FileInputStream fis;

	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void openapp() {
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");

	}

	public void login(String Un, String pwd) {
		try {
			driver.findElement(By.name("username")).sendKeys(Un);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			boolean home = driver.findElement(By.linkText("Change Password")).isDisplayed();
			if (home) {
				System.out.println("login is success");
			}
		} catch (Exception e) {
			System.out.println("login is failed");
		}

	}

	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
		// Thread.sleep(2000);
	}

	public void close() {
		driver.close();
	}
	public int getrowcount(String xlpath, int sheetid,int sheetid1) throws IOException {
		File src= new File(xlpath);
		fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
		sheet= wb.getSheetAt(sheetid);
		sheet1=wb1.getSheetAt(sheetid1);
		
		int rc= sheet.getLastRowNum();
		return rc;
		}
	public String getdata(int rowindex, int colindex) {
		String data= sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	}

	public static void main(String[] args) throws Exception  {
		keyword ob = new keyword();
	
		int jc =ob.getrowcount("C:\\Users\\sp21440\\Desktop\\key.xlsx", 0, 1);
		for (int i = 0; i <= 4; i++) {
			for(int j=0;j<=4;j++) {
			String kw1 = ob.getdata(i, 0);
			String kw2 = ob.getdata(j, 0);
			String kw3 = ob.getdata(j, 1);

			
			if (kw1.equalsIgnoreCase("ob")) {
				ob.openbrowser();
			} else if (kw1.equalsIgnoreCase("openapp")) {
				ob.openapp();
			} else if (kw1.equalsIgnoreCase("login")) {
				ob.login(kw2, kw3);
			} else if (kw1.equalsIgnoreCase("lg")) {
				ob.logout();
			} else {
				ob.close();

			}

		}

	}

}
}
