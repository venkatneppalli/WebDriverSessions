package GetAttributevalue_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class getAttributes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();		
		driver.get("http://www.allinterview.com/Interview-Questions/Software.html");
		
		List<WebElement> element = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(element.size());
		
		
		for (int i=0;i<element.size();i++){
		
			System.out.println(element.get(i).getAttribute("value"));
			
			if (element.get(i).getAttribute("value").equals("177291")){
				
				element.get(i).click();
				
			}
			
			
				
			
			
		}
		
		

	}

}
