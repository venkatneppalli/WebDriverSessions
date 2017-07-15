package MouseActions_Handel;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	/**
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException {
		
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='addlang']/a[2]"));
		
		Actions acts = new Actions(driver);
		
		acts.contextClick(element).perform();
		
		

	}

}
