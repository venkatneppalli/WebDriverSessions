package Windows_Handel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class popupie {

	
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.hdfc.com");
		
		Set<String> winid= driver.getWindowHandles();
		
		Iterator<String> itr = winid.iterator();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div/ul/li[2]/ul/li[2]/a")).click();
		
		
		
		winid = driver.getWindowHandles();
		itr= winid.iterator();
		 
		String mwinid =itr.next();
		String cwinid =itr.next();
		
		
		System.out.println("mwind= "+mwinid);
		System.out.println("cwind= "+cwinid);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*---------------------Switch back to main and click on writetous link*/
		
		//driver.close();
		
		driver.switchTo().window(mwinid);
		
		driver.findElement(By.xpath("//*[@id='acc-1-head-1']/a")).click();
		

	}

}
