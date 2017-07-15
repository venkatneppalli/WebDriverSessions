package Windows_Handel;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class TabsAndPopups {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
				
		WebDriver webdriver = new InternetExplorerDriver();
		webdriver.get("http://www.hdfc.com");
		
		System.out.println("*************Before clicking********************");
		Set<String> windowids = webdriver.getWindowHandles();
		Iterator<String> iter= windowids.iterator();
		
		System.out.println(webdriver.getCurrentUrl());
		webdriver.findElement(By.xpath("html/body/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		System.out.println(webdriver.getCurrentUrl());
		webdriver.findElement(By.xpath("html/body/div/div[2]/div[2]/div/ul/li[2]/ul/li[2]/a")).click();
		
		System.out.println("**************After clicking the tab link********************");
		
		 windowids = webdriver.getWindowHandles();
		 iter= windowids.iterator();
		 String mainWindowId=iter.next();
		 String tabbedWindowId=iter.next();
		 System.out.println(mainWindowId);
		 System.out.println(tabbedWindowId);
		 
		Thread.sleep(3000L);
		// switch over to popup/tab
		webdriver.switchTo().window(tabbedWindowId);
		
		System.out.println(webdriver.getCurrentUrl());
		webdriver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/p[2]/a")).click();
		
		/*System.out.println("********* AFTER CLICKING THE POPUP LINK");
		 windowids = webdriver.getWindowHandles();
		 iter= windowids.iterator();
		 iter.next();
		 iter.next();
		 String popupwindowid=iter.next();
		 System.out.println(mainWindowId);
		 System.out.println(tabbedWindowId);
		 System.out.println(popupwindowid);
		 webdriver.switchTo().window(popupwindowid);
		
		 webdriver.switchTo().window(tabbedWindowId);
		 webdriver.switchTo().window(mainWindowId);
		 */
		
	}

}
