package Exceptions_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceptionTesting {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// NoSuchElement_Exception();
		ElementNotVisible_Exception();
	}

	public static void NoSuchElement_Exception() {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q1")).sendKeys("testing");

	}

	public static void ElementNotVisible_Exception() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://platform.drawbrid.ge");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='_loginButton']")).click();

	}

}
