package BinaryPaths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserBinaryPaths {

	public static void main(String[] args) {
		
		//ChromeBrowser_BinaryPath();
		//FirefoxBrowser_BinaryPath();
		IEBrowser_BinaryPath();
	}
	
	
	public static void ChromeBrowser_BinaryPath() {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("chrome");

		cap.setCapability("chrome_binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://adactin.com/HotelApp/");

		driver.manage().window().maximize();

	}


	public static void FirefoxBrowser_BinaryPath() {

		System.setProperty("webdriver.gecko.driver", "C:\\Browser_Drivers\\geckodriver.exe");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("firefox");

		cap.setCapability("firefox_binary", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://adactin.com/HotelApp/");

		driver.manage().window().maximize();

	}


	public static void IEBrowser_BinaryPath() {

		System.setProperty("webdriver.ie.driver", "C:\\Browser_Drivers\\IEDriverServer.exe");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("iexplore");

		cap.setCapability("iexplore_binary", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
		
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://adactin.com/HotelApp/");

		driver.manage().window().maximize();

	}

}
