package drop;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_byConsole {
		public void calender(String c) {
			WebDriver dr = new ChromeDriver();
			dr.get("https://demo.automationtesting.in/Datepicker.html");
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			dr.findElement(By.id("datepicker1")).click();
			for(int j=1;j<=12;j++) {
			WebElement cnt = dr.findElement(By.xpath("/html/body/div/div/a[2]/span"));
			cnt.click();	
//			
//			for(int i=1;i<=counts;i++) {
//				String text = dr.findElement(By.className("datepick-month-year")).getText();
//				if(text.equalsIgnoreCase(c)) {
//					dr.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]/option["+i+"]")).click();
//					System.out.println("selected");
//				}
//			}
		}
		}

	public static void main(String[] args) {
		calender_byConsole obj = new calender_byConsole();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month name:");
		String c = sc.nextLine();
		obj.calender(c);
	}

}
