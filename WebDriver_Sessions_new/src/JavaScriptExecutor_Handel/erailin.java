package JavaScriptExecutor_Handel;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class erailin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		erailin t = new erailin();
		t.test();	
				
	}
	
	public void test() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://us.protectyourbubble.com/");
		
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/nav/ul/li[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div[2]/div/nav/ul/li[1]/div/div/ul/li[3]/a")));
			
		foo.click();
		
		
	}
	
	
	

}
