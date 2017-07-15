package BackfrontButtons_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class backfrontbuttons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://google.com");
		driver.get("http://gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
