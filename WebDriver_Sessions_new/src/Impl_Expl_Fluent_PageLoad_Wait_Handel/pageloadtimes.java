package Impl_Expl_Fluent_PageLoad_Wait_Handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageloadtimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		long start = System.currentTimeMillis();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("tesging");
		
		
		long end = System.currentTimeMillis();
		
		long t = end-start;
		
		System.out.println("TIME TAKE:= "+t/1000+" second");
		
		System.out.println("end");
		
		

	}

}
