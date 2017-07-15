package Alerts_Handel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class rediffalert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProfilesIni allprofiles = new ProfilesIni();
				
		System.setProperty("webdriver.firefox.driver", "venkat");
		
		FirefoxProfile profile = allprofiles.getProfile("venkat");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://in.rediff.com/");
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		
		

	}

}
