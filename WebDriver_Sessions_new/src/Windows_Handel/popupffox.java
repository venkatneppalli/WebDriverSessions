package Windows_Handel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class popupffox {

	
	public static void main(String[] args) {
		
	
		ProfilesIni allprofiles = new ProfilesIni();
		
		System.setProperty("webdriver.firefox.profile", "venkat");
		
		FirefoxProfile profile = allprofiles.getProfile("venkat");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://www.hdfc.com/");
		
		
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> itr = winid.iterator();
		String mwind= itr.next();
		String cwind=itr.next();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='acc-1-section-2']/li[2]/a")).click();
		
		System.out.println("mwind= "+mwind);
		System.out.println("mwind= "+cwind);
		
		driver.switchTo().window(cwind);
		

	}

}
