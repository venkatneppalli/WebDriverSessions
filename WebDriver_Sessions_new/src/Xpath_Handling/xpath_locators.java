package Xpath_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_locators {

	public static void main(String[] args) {
		
		//SendKeys_with_contains();
		SendKeys_with_startswith();
	}
	
	
	public static void SendKeys_with_contains(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://adactin.com/HotelApp/");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//*[contains(@id,'username')]")).sendKeys("seleniumtesting");;
				
			}

	
public static void SendKeys_with_startswith(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://adactin.com/HotelApp/");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//*[starts-with(@id,'username')]")).sendKeys("seleniumtesting");;
				
			}
	
}
