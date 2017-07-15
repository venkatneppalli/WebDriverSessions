package Windows_Handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testpopupwindowds {

	
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/ul/li[2]/a")).click();
		
		Set<String> winid= driver.getWindowHandles();
		
		Iterator<String> itr = winid.iterator();
		
		Thread.sleep(2000);
		
		String mwinid =itr.next();
		String cwinid =itr.next();
		
		
		System.out.println("mwind= "+mwinid);
		System.out.println("cwind= "+cwinid);
		
		
		driver.switchTo().window(cwinid);
		
		
		driver.findElement(By.xpath("//*[@id='elig-form-container']/p[1]/a")).click();
		

	} 

}
