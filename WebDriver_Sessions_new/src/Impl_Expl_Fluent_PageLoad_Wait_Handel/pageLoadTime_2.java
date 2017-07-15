package Impl_Expl_Fluent_PageLoad_Wait_Handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoadTime_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);

		driver.get("http://google.com");

		driver.manage().window().maximize();

		try {

			WebElement element = driver.findElement(By.id("lst-ib1"));
			System.out.println(element);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
