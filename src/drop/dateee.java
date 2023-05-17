package drop;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateee {
        public void golgappa(String a) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Datepicker.html");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.findElement(By.id("datepicker2")).click();
		
		List<WebElement> datecount2 = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td"));
		int date =datecount2.size();
		System.out.println("datewise:"+date);
		
		for(int i=0;i<date;i++) {
			String text = dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td")).get(i).getText();
			if(text.equalsIgnoreCase(a)) {
				dr.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td")).get(i).click();
				break;
			}
			System.out.println("date is selected:"+text);
		}
		
}

	
        public static void main(String[] args) {
        	dateee dt = new dateee();
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date:");
		String a =sc.nextLine();
		dt.golgappa(a);

}
}
