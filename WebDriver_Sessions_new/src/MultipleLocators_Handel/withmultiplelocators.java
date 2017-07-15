package MultipleLocators_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class withmultiplelocators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.dirver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='gbqfq'][@type='text']"));
		element.sendKeys("mutiplelocators");
		
		
		//input[@id='phSearchInput'][@name='str']
		
		//<input id="gbqfq" class="gbqfif" name="q" type="text" autocomplete="off"

		//*[@id='label1' and @text='text1' ]
	}

}
