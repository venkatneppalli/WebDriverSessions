package Locators_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class linktexts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();;

	}

}
