package ScrollWindow_Handel;

//import mx4j.util.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class approch1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		
		 FirefoxDriver ff = new FirefoxDriver();
		 
		 
	     ff.get("http://toolsqa.com");
	     Thread.sleep(5000);
	     ff.executeScript("document.getElementById('text-8').scrollIntoView(true);");
	     //ff.executeScript(script, args)   
	        
	     
	}

}
