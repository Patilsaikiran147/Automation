package drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sanjukta111");
		driver.findElement(By.id("password")).sendKeys("Lija@1234");
		driver.findElement(By.id("login")).click();
		driver.navigate().refresh();
		Thread.sleep(1000);
		Select obj=new Select(driver.findElement(By.id("location"))) ;
		obj.selectByIndex(2);
		Select obj1=new Select(driver.findElement(By.id("hotels")));
		obj1.selectByIndex(1);
		Select obj2=new Select(driver.findElement(By.id("room_type")));
		obj2.selectByIndex(3);
		Select obj3=new Select(driver.findElement(By.id("room_nos")));
		obj3.selectByIndex(1);
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.name("datepick_in")).sendKeys("24/07/2022");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("27/07/2022");
		//Thread.sleep(2000);
		Select obj4 =new Select(driver.findElement(By.name("adult_room")));
		obj4.selectByIndex(1);
		Thread.sleep(3000);
		Select obj5= new Select (driver.findElement(By.name("child_room")));
		obj5.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("sai");
		driver.findElement(By.id("last_name")).sendKeys("kiran");
		driver.findElement(By.id("address")).sendKeys("2-2-14 http chrome");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		Select obj6=new Select (driver.findElement(By.id("cc_type")));
		obj6.selectByIndex(2);
		Select obj7=new Select (driver.findElement(By.id("cc_exp_month")));
		obj7.selectByVisibleText("December");
		Select obj8=new Select(driver.findElement(By.id("cc_exp_year")));
		obj8.selectByVisibleText("2022");
		Thread.sleep(2000);
		driver.findElement(By.id("cc_cvv")).sendKeys("234");
		Thread.sleep(2000);
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(4000);
		System.out.println("success");
	
	}

}
