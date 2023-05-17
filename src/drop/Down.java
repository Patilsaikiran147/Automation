package drop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Down {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		// Thread.sleep(2000);
		d.get("https://demo.mobiscroll.com/select/country-picker");
	
}
}