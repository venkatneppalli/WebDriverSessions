package MouseActions_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovejquery {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/draggable/");
		
		Thread.sleep(30L);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='global-nav']/nav/div/ul[2]/li[5]/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//*[@id='global-nav']/nav/div/ul[2]/li[5]/ul/li[3]/a")).click();
		
				
	}

}
