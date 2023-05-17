package drop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("Ojas");
		String x=un.getAttribute("value");
		System.out.println(x);
		
		
	}

}
