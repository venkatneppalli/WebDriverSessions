package GetAttributevalue_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class getAttributsHREF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		WebElement element = driver.findElement(By.linkText("Hindi"));
		
		System.out.println(element.getAttribute("href"));
		
		
		
		//List<WebElement> lst = element.findElements(By.linkText(linkText))
		
		
		

	}

}
