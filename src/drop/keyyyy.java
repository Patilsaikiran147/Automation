package drop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyyyy {
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static XSSFWorkbook wb;
	public static FileInputStream fis;
	
	public void lauchapp() 
		{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		}
	public void login(String username, String password) 
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("login_button")).click();
	}
	public void logut()  
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	public void closeBrowser() 
	{
		driver.close();
	}
	public int getrowcount(String xlpath, int sheetid) throws IOException 
	{
		File src= new File(xlpath);
		fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
		sheet= wb.getSheetAt(sheetid);
		int rc= sheet.getLastRowNum();
		return rc;
	}
	public String getdata(int rowindex, int colindex) 
	{
		String data= sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}


	public static void main(String[] args) throws IOException {
		keyyyy obj=new keyyyy();
		int rc = obj.getrowcount("C:\\Users\\sp21440\\Desktop\\key.xlsx", 1);
		
		System.out.println(rc);
		
		for(int i=0;i<=rc;i++) 
		{
			String kw=obj.getdata(i, 0);
			if(kw.equalsIgnoreCase("ob"))
			{
				obj.lauchapp();
			} 
			else if(kw.equals("openapp")) 
				{
				int Credentials=obj.getrowcount("C:\\Users\\sp21440\\Desktop\\key.xlsx", 0);
				for (int k=0;k<=Credentials;k++) 
				{
					
					String uname=obj.getdata(k,0);
					String pwd=obj.getdata(k, 1);
					System.out.println(uname);
					System.out.println(pwd);
					obj.login(uname,pwd);
					obj.logut();
					
					
			
				}
				}
		}
		}
	}

