package drop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IncognitoWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				ChromeOptions cp = new ChromeOptions();
				cp.addArguments("--Incognito");
				WebDriver dr = new ChromeDriver(cp);
				dr.get("https://www.softwaretestingmaterial.com/");
				Thread.sleep(2000);
				dr.navigate().to("https://adactinhotelapp.com/HotelAppBuild2/");
	}

}
