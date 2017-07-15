package FirefoxProfiles_Handel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfilesInitest {

	
	public static void main(String[] args) {
		
		
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile fx = profile.getProfile("Ram");
		
		WebDriver driver = new FirefoxDriver(fx);
		
		
		
		

	}

}
