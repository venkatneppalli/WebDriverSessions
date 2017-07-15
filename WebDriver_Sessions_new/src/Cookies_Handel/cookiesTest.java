package Cookies_Handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
//import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesTest {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		
		getCookiesNames();
			
		
	}
	
	
	public static void getCookiesNames(){
		
		driver.get("http://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("seleniumtesting");
		
		driver.findElement(By.id("password")).sendKeys("password");
		
		Set<Cookie> cookies= driver.manage().getCookies();
		
		Iterator<Cookie> iter = cookies.iterator();
		while(iter.hasNext()){
			Cookie c = iter.next();
			System.out.println("Cookie Name before delete ="+c.getName());
		
			
			driver.manage().deleteCookieNamed(c.getName());
		}
		
		driver.manage().deleteAllCookies();
		
		
		
		
		Iterator<Cookie> itera = cookies.iterator();
		while(itera.hasNext()){
			Cookie c = itera.next();
			System.out.println("Cookie Name after delete ="+c.getName());
			
		}
		
		
	}

}
