 package drop;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbbbb {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			WebElement ele = list.get(i);
			String str = ele.getAttribute("href");
			verifyLink(str);
		}
}

	public static void verifyLink(String linkstr) {
		// TODO Auto-generated method stub
		try {
			URL link = new URL(linkstr);
			HttpURLConnection  http =(HttpURLConnection)link.openConnection();
			http.setRequestMethod("HEAD");
			http.connect();
			int respcode = 200;
			respcode = http.getResponseCode();
			if(respcode>=400) {
				System.out.println(link+"is a broken link");
			}
			else {
				System.out.println(link+"is a valid link");
			}
		} catch (Exception e) {
		
		
	}
	}
}

