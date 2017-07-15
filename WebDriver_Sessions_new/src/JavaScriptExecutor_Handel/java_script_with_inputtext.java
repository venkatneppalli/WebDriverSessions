package JavaScriptExecutor_Handel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class java_script_with_inputtext {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("document.getElementById('q').value='value here'");

	}

}
