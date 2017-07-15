package WebDriver_Instance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keywords_class {
	
	
	public static WebDriver driver;
	
	@Test
	public void navigateURl(){
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
				
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
	}
	
	
	public static WebDriver getDriver()
	{
	    return driver;
	}
	
}
