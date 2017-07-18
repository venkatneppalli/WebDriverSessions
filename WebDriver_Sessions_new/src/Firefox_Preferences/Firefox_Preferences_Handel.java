package Firefox_Preferences;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Preferences_Handel {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		// about:config in Firefox Browser

		System.setProperty("webdriver.gecko.driver", "C:\\Browser_Drivers\\geckodriver.exe");
		//downloadSaveAsFile_Preferences();
		startuphomepage_Preferences();
		
	}

	public static void downloadSaveAsFile_Preferences() {

		ProfilesIni pf = new ProfilesIni();

		FirefoxProfile fp = pf.getProfile("my_profile");

		// Set Location to store files after downloading.
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "D:\\GitRepository\\WebDriver_Sessions_new\\src\\DownloadFiles");
		
		// Set Preference to not show file download confirmation dialogue using
		// MIME types Of different file extension types.
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		fp.setPreference( "pdfjs.disabled", true );

		driver = new FirefoxDriver(fp);
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='mainContent']/p[7]/a[1]")).click();
		
	}
	
	public static void startuphomepage_Preferences() {

		ProfilesIni pf = new ProfilesIni();

		FirefoxProfile fp = pf.getProfile("my_profile");
		fp.setPreference("browser.startup.homepage","http://www.seleniumhq.org");
		
		driver = new FirefoxDriver(fp);
		driver.manage().window().maximize();
	}

}
