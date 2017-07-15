package Impl_Expl_Fluent_PageLoad_Wait_Handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testt {

	
	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.aa.com/intl/fr/index_en.jsp");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='menu-plan']"));
		
		ele.click();
		
		//Thread.sleep(2000);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		//WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='plan']/div[2]/ul[3]/li[6]/a")));
		
		//WebElement el =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='plan']/div[2]/ul[3]/li[6]/a")));
		
		//System.out.println(el);
		
		
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(1, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		
		
		WebElement fele = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='plan']/div[2]/ul[3]/li[6]/a")));
		
		fele.click();
		
		
		//WebElement eles = driver.findElement(By.xpath("//*[@id='plan']/div[2]/ul[3]/li[6]/a"));
		
		//el.click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='plan']/div[2]/ul[3]/li[6]/a")));
		
		//ele.click();
		
		//System.out.println(ele.isDisplayed());
		
		/*
		FluentWait<WebDriver> fwait =new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		
	
		WebElement elem = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		elem.click();
		*/
		
		
	}

}
