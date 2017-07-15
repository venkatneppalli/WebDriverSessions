package MouseActions_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\ChromeDriver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		
			
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("https://drive.draw.io/");
			
		Thread.sleep(30L);
		
		WebElement element = driver.findElement(By.xpath("/html/body"));
		System.out.println(element.getLocation());
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
		//act.dragAndDropBy(element, 2, 2).build().perform();
		

	}

}
