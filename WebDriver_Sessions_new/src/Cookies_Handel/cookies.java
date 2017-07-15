package Cookies_Handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class cookies {

	public static void main(String[] args) {
		
		
		ProfilesIni allprofiles = new ProfilesIni();
		
		System.setProperty("webdriver.firefox.profile", "venkat");
		FirefoxProfile profile = allprofiles.getProfile("venkat");
		
		profile.setAcceptUntrustedCertificates(true);
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://google.com");
		
		Set<Cookie> cookie = driver.manage().getCookies();
		
		System.out.println("Cookie Size= "+cookie.size());
		
		Iterator<Cookie> itr = cookie.iterator();
		
		while(itr.hasNext()){
			
			Cookie c =  itr.next();
			
			System.out.println("CookieName= "+c.getName());
			
			
		}
		
		

	}

}
