package drop;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class demo {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/crm/lp/login.html");
		driver.findElement(By.id("login_id")).sendKeys("admin1");
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("nextbtn")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("zohoiam");
		WebElement errMsg=driver.findElement(By.id("msgpanel")); 
		if(errMsg.isDisplayed());
		{
		System.out.println(errMsg.getText());
		}
//		driver.get("http://www.actimind.com");
//		WebElement menu = driver.findElement(By.className("c-link "));
//		Actions actions=new Actions(driver); 
//		actions.moveToElement(menu).perform();
//		driver.findElement(By.linkText("Basic Facts")).click();
	}
	}
//		WebDriver driver=new ChromeDriver(); 
//		driver.get("http://www.makemytrip.com/flights");
//		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label"));
//		textbox.click();
//	//	textbox.clear();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("indi");
//		Thread.sleep(2000);
//	//	textbox.sendKeys("Bang");
//		//Thread.sleep(2000); 
//		List<WebElement> allOptions =driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
//		int count=allOptions.size();
//		System.out.println("No. of autosuggestions "+ count); 
//		System.out.println("List of autosuggstions");
//		for(int i=0;i<count;i++)
//		{
//		String text=allOptions.get(i).getText();
//		System.out.println(text);
//		}
//		textbox.sendKeys(Keys.ARROW_DOWN);
//		textbox.sendKeys(Keys.ARROW_DOWN);
//		textbox.sendKeys(Keys.ENTER);
//		} }
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://www.google.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("selenium");
//		String xp="//div[contains(text(),'selenium')]"; 
//		List<WebElement> allAut = driver.findElements(By.xpath(xp)); 
//		int count=allAut.size();
//		System.out.println("No of autosuggesions:"+count);
//		System.out.println("List of Autosuggestions..");
//		int position=0;
//		for(int i=0;i<count;i++)
//		{
//		WebElement aut = allAut.get(i);
//		String text=aut.getText();
//		System.out.println(text);
//		if(text.equals("selenium"))
//		{
//		position=i;
//		} }
//		allAut.get(position).click();
//		}
			
		
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//		WebElement listBox = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")); 
//		Select select= new Select(listBox);
//		List<WebElement> allOptions = select.getOptions(); 
//		HashSet<String> allText=new HashSet<String>(); 
//		for(int i=0;i<allOptions.size();i++)
//		{
//		String text = allOptions.get(i).getText(); 
//		if(allText.add(text)==false) {
//		System.out.println(text); //print duplicate
//		}else{
//			System.out.println("no duplicate");
//		}
//		}
//		
//		 
//	}



//WebDriver driver=new ChromeDriver(); 
//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//WebElement findElement = driver.findElement(By.//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
//Select sel = new Select(findElement);
// List<WebElement> list = sel.getOptions();
// int size = list.size();
// System.out.println(size);
// for(int i=0;i<size-1;i++) {
//	 sel.selectByIndex(i);
//	 System.out.println(list.get(i).getText());
// }