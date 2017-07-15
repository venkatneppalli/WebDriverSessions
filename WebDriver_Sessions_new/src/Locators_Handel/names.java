package Locators_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class names {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.dirver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing name locator");;

	}

}
