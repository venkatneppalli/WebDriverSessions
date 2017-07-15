package Locators_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class classnames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.dirver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.className("gsfi")).sendKeys("testing classname");

	}

}
