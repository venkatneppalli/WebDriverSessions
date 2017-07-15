package JavaScriptExecutor_Handel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathinjs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.document.getElementById('signIn').click()");

	}

}
