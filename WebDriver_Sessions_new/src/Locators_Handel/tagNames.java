package Locators_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class tagNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.dirver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		WebElement element = driver.findElement(By.tagName("input"));
		
		List<WebElement> list = element.findElements(By.tagName("a"));
		
		list.size();
		


	}

}
