package drop;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("Register")).click();
		Thread.sleep(2000);

		Set<String> sl = driver.getWindowHandles();
		System.out.println(sl);

		//Iterator<String> it = sl.iterator();
		String parentwin =driver.getWindowHandle();
		String childwin = driver.getWindowHandle();
		
		
		Thread.sleep(7000);
		driver.switchTo().window(parentwin);
		Thread.sleep(3000);
		driver.findElement(By.className("view-all-comp")).click();
		Thread.sleep(3000);
		String childwin2 =driver.getWindowHandle();
		//String childwin2 = it.next();
		//for(String a:childwin2)
		//{
			//System.out.println(a);
		
		driver.switchTo().window(childwin2);
		System.out.println(childwin2);
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
}
}
