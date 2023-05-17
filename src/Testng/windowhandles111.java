package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://talentzing.com/");
		driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
		driver.findElement(By.xpath("//a[text()='FeedBack']")).click();
		String parentHandle;
		parentHandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		for(String h1:allhandles) {
		driver.switchTo().window(h1);
		String URL = driver.getCurrentUrl();
		if (URL.contains("TermsAndConditions"))
		{
		driver.findElement(By.xpath("//input[@id='btnOk']")).click();
		driver.close();
		break; } }
		driver.switchTo().window(parentHandle);
	}

}
