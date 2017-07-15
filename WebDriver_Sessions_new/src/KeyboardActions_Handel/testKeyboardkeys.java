package KeyboardActions_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testKeyboardkeys {

	public static WebDriver driver;

	public static void main(String[] args) {

		HoldKeys_backtabbing();
		
	}

	public static void ScrollBar_Test() {

		System.setProperty("webdriver.ie.driver", "C:\\Browser_Drivers\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();

		driver.get("http://yahoo.com");

		driver.findElement(By.xpath("/html")).sendKeys(Keys.PAGE_DOWN);

		driver.findElement(By.xpath("/html")).sendKeys(Keys.ADD);
	}

	
	public static void HoldKeys_backtabbing(){
		

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Keys.chord(Keys.SHIFT));
		

		
	}
	
}
