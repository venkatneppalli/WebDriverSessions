package CountElements_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CoutLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer_Win32_2.31.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		
		System.out.println(element.size());
		
		for(int i=0;i<element.size();i++){
			
			System.out.println("links name: "+element.get(i).getText());
		}
		
		
	}

}
