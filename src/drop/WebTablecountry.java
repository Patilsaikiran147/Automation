package drop;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablecountry {
	public void country(String s) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> column = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[1]/td")); // no of columns in table
		List<WebElement> row = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr")); // full table 
		
		int columns = column.size();
		int rows = row.size();
		System.out.println(columns);
		System.out.println(rows);
		for (int i = 1; i <= rows; i++) {
			String value = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[" + i + "]/td[2]")).getText(); //country                         
			if (value.equalsIgnoreCase(s)) {

				driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" + i + "]/td[1]/input")).click(); // radio box
				System.out.println("Selected ");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		WebTablecountry obj = new WebTablecountry();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name");
		String s = sc.nextLine();
		obj.country(s);

	}

}
