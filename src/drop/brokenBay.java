package drop;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenBay {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		for(int i=0;i<links.size();i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLink(url);
		}
	}

	private static void verifyLink(String urlLink) {
		try {
		// TODO Auto-generated method stub
		URL link = new URL(urlLink);
		HttpURLConnection http =(HttpURLConnection)link.openConnection();
		http.setRequestMethod("HEAD");
		http.connect();
		int respCode = 200;
		respCode = http.getResponseCode();
		if(respCode >=400) {
			System.out.println(link+"is a broken link");
			System.out.println();
	}
		else {
System.out.println(link+"is valid link");
}
}
		catch (Exception e) {
		}
}
}