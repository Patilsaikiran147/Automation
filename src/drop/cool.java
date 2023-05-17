package drop;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cool {
	public void calender(String c, String y, String d) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Datepicker.html");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.id("datepicker2")).click();
		WebElement month = dr.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]"));
		month.click();
	//	===================== months=================================================================================================
		List<WebElement> list = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]/option"));
		int lists = list.size();
		System.out.println("number of month:"+lists);
		for (int i = 0; i < lists; i++) {
			String text = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]/option")).get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(c)) {
				dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]/option")).get(i).click();
			}
		}
		System.out.println("Ur Selected month is clicked:" + c);
		System.out.println();
	//  =======================years===================================================================================================
		WebElement year = dr.findElement(By.className("datepick-month-year"));
		year.click();
		List<WebElement> list2 = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]/option"));
		int listofyear = list2.size();
		System.out.println("number of year:" + listofyear);
		for (int j = 0; j < listofyear; j++) {
			String text2 = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]/option")).get(j)
					.getText();
			System.out.println(text2);
			if (text2.equalsIgnoreCase(y)) {
				dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]/option")).get(j).click();
			}
		}
		System.out.println("Ur Selected year is clicked:" + y);
		System.out.println();
  //    ======================Date========================================================================================================
		List<WebElement> datecount2 = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td"));
		int date = datecount2.size();
		System.out.println("datewise:" + date);

		for (int k = 0; k < date; k++) {
			String text3 = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td")).get(k)
					.getText();
			if (text3.equalsIgnoreCase(d)) {
				dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td")).get(k).click();
				System.out.println("date is selected:" + text3);
				break;
			}
		}
		System.out.println();
	//===================================days=============================================================================================
		List<WebElement> daycount = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/thead/tr/th"));
		int day = daycount.size();
		System.out.println("day_wise:"+ day);
		
		for(int l=1; l<=day; l++) {
			String text3 = dr.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td["+l   +"]")).getText();
			if(text3.equalsIgnoreCase(d)) {
			WebElement element = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/thead/tr/th["+l+"]/span")).get(l);
			Thread.sleep(2000);
			element.click();
			String dayis = element.getText();
				 System.out.println("day is:"+dayis);
			//	 System.out.println(text3);
			}
		}	
	//  ============================ full format ==========================================================================================
		System.out.println("you have entered calendar date is : "+c+" "+y+" "+d+"th");
		dr.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		cool cl = new cool();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month name:");
		String c = sc.nextLine();
		System.out.println("Enter the year:");
		String y = sc.next();
		System.out.println("Enter the date:");
		String d = sc.next();
		cl.calender(c, y, d);
	}
}
