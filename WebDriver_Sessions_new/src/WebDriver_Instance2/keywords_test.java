package WebDriver_Instance2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords_test {
	
	
	public static WebDriver driver;
	
	public void test1(){
		
System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
				
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing");
	}

}
