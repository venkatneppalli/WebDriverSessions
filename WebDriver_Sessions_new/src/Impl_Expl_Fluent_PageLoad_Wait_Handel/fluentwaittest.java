package Impl_Expl_Fluent_PageLoad_Wait_Handel;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwaittest {

	public static WebDriver driver;

	public static void main(String[] args) {

		fluentWait_Method();
		
	}

	public static void fluentWait_Method() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.get("http://adactin.com/HotelApp/");

		//synchronization_Time("//*[@id='username1']");
		
		
		
		driver.findElement(By.xpath("//*[@id='username1']")).sendKeys("seleniumtesting");
		
		driver.findElement(By.id("password")).sendKeys("password1");
		
		//driver.findElement(By.id("login")).click();
		
		
	}
	
	
	public static void synchronization_Time(String objectname,WebElement foo){
		
		long starts = System.currentTimeMillis();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);

			foo = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.xpath(objectname));
			}
			});

		long ends = System.currentTimeMillis();

		long totals = ends - starts;

		System.out.println("Total Time:= " + totals / 1000 + " seconds");

	}

}
