package CheckboxListBox_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CheckBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver","C:\\selenium_jars\\chromedriver.exe" );
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='PersistentCookie']"));
		
		System.out.println(element.getAttribute("checked"));
		System.out.println(element.isSelected());
		element.click();
		
		System.out.println(element.getAttribute("checked"));
		System.out.println(element.isSelected());
		
		//*[@id='PersistentCookie']

	}

}
