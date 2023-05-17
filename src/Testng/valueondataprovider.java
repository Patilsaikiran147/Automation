package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class valueondataprovider {

  	WebDriver driver;
  	
  	@DataProvider(name = "test-data")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{{"Lambda Test"},{"Automation"}};
  	}
  	
  	@BeforeMethod
  	  public void setUp() {
        	 
        	  System.out.println("Start test");
        	  driver = new ChromeDriver();
        	  driver.get("https://www.google.com");
        	  driver.manage().window().maximize();
        	   }
  																																																																																																																																																																																																																																																																																																																																																																												
  	@Test(dataProvider ="test-data")
  	public void search(String keyWord) throws InterruptedException{
        	WebElement txtBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        	  txtBox.sendKeys(keyWord);
        	  Reporter.log("Keyword entered is : " +keyWord);
        	  txtBox.sendKeys(Keys.ENTER);
        	  Reporter.log("Search results are displayed.");
        	  Thread.sleep(2000);
  	}
  	
  	@AfterMethod
  	public void burnDown(){
        	driver.quit();
  	}
}
