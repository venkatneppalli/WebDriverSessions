package Impl_Expl_Fluent_PageLoad_Wait_Handel;

//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testall {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.w3schools.com/ajax/default.ASP");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='main']/div[4]/div/button"));
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/div[4]/div/button")));
		
		ele.click();
		
		System.out.println(ele.isDisplayed());
		
		
		
		FluentWait<WebDriver> fwait =new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		
	
		WebElement elem = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		elem.click();
		
	}

}
