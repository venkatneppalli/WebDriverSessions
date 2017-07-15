package WorkingDrivers_Handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class testhtmlunidrive {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_45);
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		//Click on Personal Loan link in HDFCBANK site
		WebElement element = driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/ul/li[2]/a"));
		
		element.click();
		
		Set<String> windid = driver.getWindowHandles();
		
		Iterator<String> itr = windid.iterator();
		
		String mainwind = itr.next();
		String childwind = itr.next();
		
		System.out.println("Print main window id: "+mainwind);
		System.out.println("Print child window id: "+childwind);
		
		
		driver.switchTo().window(childwind);
		
		Thread.sleep(6000);
		
		//Click on terms and conditions in child window
		//WebElement elementwait = driver.findElement(By.xpath("//*[@id='elig-form-container']/p[1]/a"));
		
		
		WebElement ele = (new WebDriverWait(driver,40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='elig-form-container']/p[1]/a")));
		
		ele.click();
		
		System.out.println("Clicked on child window lin");

	}

}
