package FireBugFirePath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddFireBugPathProfile {

	public static void main(String[] args) throws IOException {
		
		FirefoxBrowser_AddFireBugPath();

	}
	
	
	public static void FirefoxBrowser_AddFireBugPath() throws IOException{
	   
		System.setProperty("webdriver.gecko.driver", "C:\\Browser_Drivers\\geckodriver.exe");
		
        ProfilesIni profile = new ProfilesIni();
       
        FirefoxProfile fx = profile.getProfile("selenium_test");
       


        
        fx.addExtension(new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\FireBugFirePath\\firebug-2.0.19-fx.xpi"));
        
        fx.addExtension(new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\FireBugFirePath\\firepath-0.9.7.1-fx.xpi"));


        
        DesiredCapabilities cap = new DesiredCapabilities();
       
        cap.setCapability("firefox_profile", fx);
       
        cap.setCapability("firefox_binary", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
       
        cap.setBrowserName("firefox");
       
        WebDriver driver = new FirefoxDriver(cap);
       
        driver.get("http://adactin.com/HotelApp/");

		driver.manage().window().maximize();

       
 }

	
	

}
