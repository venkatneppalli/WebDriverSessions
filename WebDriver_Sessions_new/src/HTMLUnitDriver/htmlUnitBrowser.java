package HTMLUnitDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class htmlUnitBrowser {

	public static void main(String[] args) throws InterruptedException {

		//html_chrome();
		html_javascrptEnabled();
	}
	
public static void html_javascrptEnabled() throws InterruptedException{
		
		HtmlUnitDriver driver = new HtmlUnitDriver(true);
		
		//driver.setJavascriptEnabled(true);
		
		driver.get("http://adactin.com/HotelApp/");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id='login']"));
		
    	Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		System.out.println("End of execution");
	}
	
	
	public static void html_chrome() throws InterruptedException{
		
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.EDGE);
		
		driver.get("http://adactin.com/HotelApp/");
		
		System.out.println("Launched ChromeBrowser with URL"+driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		System.out.println("Browser Maximized");
		
		WebElement userID=driver.findElement(By.id("username"));
		userID.sendKeys("seleniumtesting");
		
		System.out.println("Entered UserName:= "+userID.getAttribute("value"));
		
		WebElement passID=driver.findElement(By.id("password"));
		passID.sendKeys("password1");
		
		System.out.println("Entered Password:= "+passID.getAttribute("value"));
		
		Thread.sleep(3000);
		
		WebElement loginBtn=driver.findElement(By.id("login"));
		
		System.out.println("Clicking on Login Button"+loginBtn.getAttribute("value"));
		
		loginBtn.click();
		
	}

}
