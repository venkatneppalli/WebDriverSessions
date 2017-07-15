package Windows_Handel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.irctc.co.in");
		
		Set<String> s= driver.getWindowHandles();
		
		Iterator<String> itr = s.iterator();
		
	driver.findElement(By.xpath("//*[@id='maincontentbody']/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/input")).click();
	driver.findElement(By.xpath("//*[@id='maincontentbody']/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/input")).click();
		
		
		
		s = driver.getWindowHandles();
		itr= s.iterator();
		 
		String uid =itr.next();
		String pid =itr.next();
		
		
		System.out.println("mwind= "+uid);
		System.out.println("cwind= "+pid);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*---------------------Switch back to main and click on writetous link*/
		
		driver.close();
		
		driver.switchTo().window(uid);
		
		//driver.findElement(By.xpath("//*[@id='acc-1-head-1']/a")).click();
		

	}

}
