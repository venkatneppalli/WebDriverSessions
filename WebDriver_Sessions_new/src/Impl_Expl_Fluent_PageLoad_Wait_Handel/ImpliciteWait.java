package Impl_Expl_Fluent_PageLoad_Wait_Handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliciteWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("started.........");

		long start = System.currentTimeMillis();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("http://google.com");

		driver.manage().window().maximize();

		try {

			WebElement element = driver.findElement(By.id("lst-ib1"));
			System.out.println(element);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		long end = System.currentTimeMillis();

		long t = end - start;

		System.out.println("TIME TAKE:= " + t / 1000 + " second");

		System.out.println("end");

	}

}
