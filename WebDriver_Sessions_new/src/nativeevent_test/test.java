package nativeevent_test;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test {

	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("iexplore.exe");
		//cap.setCapability("nativeEvents", false);
		
		//cap.setCapability("ignoreZoomSetting", true);
		
		WebDriver driver = new InternetExplorerDriver(cap);
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id='bmenu']/ul/li[2]/a/span"));
		
		driver.get("http://apycom.com/");
		
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();

	}

}
