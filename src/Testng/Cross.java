package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {
			WebDriver driver;
	    	@Parameters("browser")
			@Test
			public void launch(String browser ) {
				if(browser.equalsIgnoreCase("Chrome")) {
					driver = new ChromeDriver();
					driver.get("http://adactin.com/HotelAppBuild2/");
					driver.close();
	     	}
				else if(browser.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", "C:\\Users\\sp21440\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
					driver = new  EdgeDriver();
					driver.get("http://adactin.com/HotelAppBuild2/");

				}
			}
}
