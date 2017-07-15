package Tooltips_Handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findtooltip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.cssSelector("//*[@id='yui_3_4_0_1_1360407863454_2025']/em"));
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		System.out.println(element.getAttribute("title"));
		
		
		
		
		
		
		

	}

}
