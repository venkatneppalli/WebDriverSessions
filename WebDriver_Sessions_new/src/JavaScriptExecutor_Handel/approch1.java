package JavaScriptExecutor_Handel;

//import mx4j.util.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class approch1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		 ChromeDriver ff = new ChromeDriver();
		 
		 
	     ff.get("http://toolsqa.com");
	     Thread.sleep(5000);
	     ff.executeScript("document.getElementById('text-8').scrollIntoView(true);");
	     //ff.executeScript(script, args)   
	        
	     
	}

}
