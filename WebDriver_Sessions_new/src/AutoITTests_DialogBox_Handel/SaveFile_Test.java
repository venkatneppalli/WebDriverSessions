package AutoITTests_DialogBox_Handel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SaveFile_Test {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		//SaveFile_Iexplorer();
		//SaveFile_FirefoxLink();
		SaveFile_Firefox_popup();
	}

	public static void SaveFile_Iexplorer() {

		System.setProperty("webdriver.ie.driver", "C:\\Browser_Drivers\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();

		driver.get("http://seleniumhq.org/download/");

		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();

	}

	public static void SaveFile_FirefoxLink() throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Browser_Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://seleniumhq.org/download/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='mainContent']/p[7]/a[1]")).click();

		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\SeleniumJava_Programs\\AutoIT_Scripts\\savefile\\Script To Download File.exe");
		
	}

	public static void SaveFile_Firefox_popup() throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Browser_Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://seleniumhq.org/download/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();

		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\SeleniumJava_Programs\\AutoIT_Scripts\\savefile_popup\\Download FilePopup.exe");;
		
	}

	
	
}
