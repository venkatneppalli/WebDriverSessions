package Chrome_Options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chromeBrowser {

	public static WebDriver driver;

	public static void main(String[] args) {

		//disable_extension();
		//enabled_extension();
		//addMomentum_extension();
	}

	public static void disable_extension() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		DesiredCapabilities caps = new DesiredCapabilities().chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(caps);

		driver.manage().window().maximize();

		driver.get("http://adactin.com/HotelApp/");

	}

	public static void enabled_extension() {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://adactin.com/HotelApp/");

	}
	
	public static void addMomentum_extension(){

		
		//Downlaod Extensions from website http://chrome-extension-downloader.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		
		options.addExtensions(new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ChromeExtensions\\Momentum_v0.94.0.crx"));
		
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(cap);
		
		
	}

}
