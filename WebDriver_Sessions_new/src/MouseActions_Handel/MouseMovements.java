package MouseActions_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\ChromeDriver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.walmart.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='wmHomePage']/div/div[2]/div[2]/div[1]/ul/li[4]/a"));

		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();
	
		driver.findElement(By.xpath("//*[@id='wmHomePage']/div/div[2]/div[2]/div[1]/ul/li[4]/div[2]/div/a[3]")).click();
		
		
		
		
	}

}

