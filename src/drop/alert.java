package drop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws Throwable {
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); 
				driver.manage().window().maximize();
				
				driver.findElement(By.id("promptBox")).click();
				Alert alert1 = driver.switchTo().alert();
				System.out.println(alert1.getText());
				Thread.sleep(3000);
				alert1.sendKeys("kiran");
				Thread.sleep(5000);
				alert1.accept();
				System.out.println(driver.findElement(By.id("output")).getText());
			//	driver.close();
}
}
