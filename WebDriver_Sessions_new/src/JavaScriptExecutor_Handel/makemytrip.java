package JavaScriptExecutor_Handel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class makemytrip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.makemytrip.com/");
		
		//((JavaScriptExecutor) driver).executeScript("document.getElementById('roundtrip_r').click");
		
		//<input id="roundtrip_r" type="radio" class="radio" value="R" name="radtripType" onclick="mmt.hp.onewayfn();" tabindex="2">
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.document.getElementById('roundtrip_r').click()");
		
	}

}
