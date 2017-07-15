package EventFireWebDriver_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerTest {

	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver web_driver = new FirefoxDriver();
		
		EventFiringWebDriver event_driver = new  EventFiringWebDriver(web_driver);
		
		MyListener listener = new MyListener();
		
		event_driver.register(listener);
		
		
		web_driver.navigate().to("http://google.com");
		
		web_driver.findElement(By.name("q")).sendKeys("test");
		
		web_driver.findElement(By.xpath("//*[@id='gbqfb']/span")).click();
		
		Thread.sleep(2000);
		
		
		System.out.println("Going to click on back button");
		
		web_driver.navigate().back();
		
		System.out.println("clicking back button");
		
		web_driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		
	}

}
