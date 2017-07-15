package HighlightElementInApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class elehigh {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		Thread.sleep(3000L);
		//WebElement clickele = 
		driver.findElement(By.xpath("//*[@id='gbqfq']")).sendKeys("highlight");
		
		//highlightElement(driver,clickele);
		
		
		//WebElement clickdrp = driver.findElement(By.xpath("//*[@id='cmbQuota']"));
		
		//highlightElement(driver,clickdrp);
		
		//clickele.sendKeys("sending");
		

	}
	
	public static void highlightElement(WebDriver driver, WebElement element) { 
		
		for (int i = 0; i < 2; i++) { 
			JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 2px solid yellow;"); js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, ""); 
		}
		
		} 


}
