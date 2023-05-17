package drop;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbar-backup-backup\"]/div/div[3]/a[2]")).click();
		String parent= driver.getWindowHandle();System.out.println(parent);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Help")).click();
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Set<String> windowids= driver.getWindowHandles();
		for(String k: windowids) {
		if(!k.equals(parent)) {
		System.out.println(k);
		driver.switchTo().window(k);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		// driver.close();
		}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.name("email")).sendKeys("Iliyana");
		// driver.quit();
		driver.close();}

}
