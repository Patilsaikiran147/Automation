package drop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("wedriver.edge.driver","‪C:\\Users\\sp21440\\Downloads\\edgedriver_win64 (2)");
			WebDriver dr = new FirefoxDriver();
			dr.get("https://demo.automationtesting.in/Datepicker.html");
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			dr.findElement(By.id("datepicker2")).click();
			Select month = new Select(dr.findElement(By.className("datepick-month-year")));
			month.selectByIndex(9);              // it select october
			Select year = new Select(dr.findElement(By.xpath("(//*[@class='datepick-month-year'])[2]")));
			year.selectByIndex(12);              // it select year 2023
			dr.findElement(By.linkText("8")).click();   //it select date
			System.out.println("it's october 8th:Happy birthday lija:::Keeping smiling & be happy always:-) ");
	}

}
