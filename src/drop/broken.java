package drop;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));          // for multiple links locator(tagname("a")
	System.out.println("Total links are "+links.size());				    // total number of links 
	for(int i=0; i<links.size(); i++) {									    //loop count
	WebElement element = links.get(i);									    // get all the links
	String url=element.getAttribute("href");                                //By using "href" attribute, we could get the url of the required link
	verifyLink(url);													    //calling verifyLink() method here. Passing the parameter as url which we collected in the above link
	                                          							    //See the detailed functionality of the verifyLink(url) method below
	}
	}
	public static void verifyLink(String urlLink) {						    // The below function verifyLink(String urlLink) verifies any broken links and return the server status.
	        try {														    // try block to handle the exception
	URL link = new URL(urlLink);										    //Use URL Class - Create object of the URL Class and pass the urlLink as parameter
	HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();	// Create a connection using URL object (i.e., link)
	httpConn.setRequestMethod("HEAD");									    //use setRequestCode() to send the request code
	httpConn.connect();													    //connect using connect method
	int respCode =200;													    // initialize 200(ok)
	respCode =httpConn.getResponseCode();								    //use getResponseCode() to get the response code
	if(respCode >= 400){												    // 400(bad request)  if response code is greater than equal to 400 are error
		System.out.println(link+" is a broken link");
		System.out.println();
		}
		else{
		System.out.println(link+" is a valid link");
		}
	
	}
	catch (Exception e) {
	}
	    }
}


