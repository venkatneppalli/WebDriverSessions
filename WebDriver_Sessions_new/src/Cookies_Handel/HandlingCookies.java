package Cookies_Handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class HandlingCookies {

	
	public static void main(String[] args) {
		
		
		ProfilesIni allProfiles = new ProfilesIni();

		System.setProperty("webdriver.firefox.profile","venkat");

		FirefoxProfile profile = allProfiles.getProfile("venkat"); 
		
		profile.setAcceptUntrustedCertificates (true); 

		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http:\\gmail.com");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Total number of Cookeis "+cookies.size());
		
		//driver.manage().deleteAllCookies();
		
		//System.out.println("Total number of Cookeis "+cookies.size());
		
		Iterator<Cookie> iter = cookies.iterator();
		while(iter.hasNext()){
			Cookie c = iter.next();
			System.out.println("Cookie Name ="+c.getName());
			
			
		}
		
		
		
		
	}

}
