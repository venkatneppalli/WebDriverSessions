package FirefoxProfiles_Handel;


import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

	public class certf {

		
		public static void main(String[] args) throws InterruptedException {
	
			
			FirefoxProfile profile = new FirefoxProfile(); 
			
			profile.setAcceptUntrustedCertificates (true); 
			profile.setAssumeUntrustedCertificateIssuer(false);
			profile.setEnableNativeEvents(true);
			
			WebDriver driver = new FirefoxDriver(profile);
			
			driver.get("http://tmobile.com/");
			
			

		}

	}