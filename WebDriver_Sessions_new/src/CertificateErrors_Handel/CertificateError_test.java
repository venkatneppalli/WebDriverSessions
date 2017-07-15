package CertificateErrors_Handel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CertificateError_test {

	public static void main(String[] args) throws IOException {

		// ChromeBrowser_ChromeOptions();

		// ChromeBrowser_Capabilities();

		//FirefoxBrowser_Capabilities();

		 //IEBrowser_Capabilities();
		
		 //IEBrowser_JavaScript();
	}

	public static void ChromeBrowser_ChromeOptions() {

		ChromeOptions chromeopt = new ChromeOptions();

		chromeopt.addArguments("ignore-certificate-errors");

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://cacert.org/");

		driver.manage().window().maximize();
	}

	public static void ChromeBrowser_Capabilities() {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("chrome");

		cap.setCapability("chrome_binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriver driver = new ChromeDriver();

		driver.get("https://cacert.org/");

		driver.manage().window().maximize();

	}

	public static void FirefoxBrowser_Capabilities() throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\Browser_Drivers\\geckodriver.exe");

		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile ffProfile = prof.getProfile("default");

		ffProfile.setAcceptUntrustedCertificates(true);
		ffProfile.setAssumeUntrustedCertificateIssuer(false);

		WebDriver driver = new FirefoxDriver(ffProfile);

		/*
		 * 
		 * DesiredCapabilities cap = new DesiredCapabilities();
		 * 
		 * cap.setCapability("firefox_profile", fx);
		 * 
		 * cap.setCapability("firefox_binary",
		 * "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		 * 
		 * cap.setBrowserName("firefox");
		 * 
		 * 
		 * //cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 */
		// WebDriver driver = new FirefoxDriver(fx);

		driver.get("https://cacert.org/");

		driver.manage().window().maximize();

	}

	public static void IEBrowser_Capabilities() {

		System.setProperty("webdriver.ie.driver", "C:\\Browser_Drivers\\IEDriverServer.exe");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		 
		//System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver(capabilities);

		driver.get("https://cacert.org/");

		driver.manage().window().maximize();

	}
	
	public static void IEBrowser_JavaScript() {

		System.setProperty("webdriver.ie.driver", "C:\\Browser_Drivers\\IEDriverServer.exe");


		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://cacert.org/");
		
		driver.navigate ().to ("javascript:document.getElementById('overridelink').click()");
		
		driver.manage().window().maximize();

	}
	


}
