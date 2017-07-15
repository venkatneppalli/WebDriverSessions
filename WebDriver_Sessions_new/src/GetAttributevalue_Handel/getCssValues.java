package GetAttributevalue_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class getCssValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='link-forgot-passwd']"));
		
		System.out.println(element.getCssValue("word-spacing"));
		
		
		//driver.findElement(By.tagName("input"))

	}

}
