package DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class desiredcapa {


	
	public static void main(String[] args) throws MalformedURLException {
	
		  //System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		  
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setBrowserName("firefox");
		
		//Proxy proxy = new Proxy();
		
		//proxy.setAutodetect(true);
		//proxy.setProxyAutoconfigUrl("testing");
		
		//cap.setCapability(CapabilityType.PROXY, proxy);
		
		
		
		String bname=cap.getBrowserName();
		cap.getVersion();
		
		WebDriver driver = new RemoteWebDriver(new URL("localhost:4444/wd/hub"), cap);
		driver.get("http://google.com");
		
		System.out.println(bname);
		
		//WebDriver driver = new FirefoxDriver(cap);
		//WebDriver driver = new InternetExplorerDriver(cap);
		
		//driver.get("http://google.com");
		
		
		

	}

}
