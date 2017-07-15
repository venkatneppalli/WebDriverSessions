package CountElements_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CountFrames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer_Win32_2.31.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://timesofindia.indiatimes.com/");

		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<list.size();i++){
			
			System.out.println("iframe names: "+list.get(i).getAttribute("id"));
		}
		
		

	}

}
