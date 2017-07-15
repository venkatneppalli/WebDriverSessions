package Exceptions_Examples;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionTesting {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		// NoSuchElement_Exception();
		// ElementNotVisible_Exception();
		// NoSuchFrame_Exception();
		// NoSuchWindow_Exception();
		// NoAlertPresent_Exception();
		StaleElement_Exception();
	}

	public static void NoSuchElement_Exception() {

		
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q1")).sendKeys("testing");

	}

	public static void ElementNotVisible_Exception() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://platform.drawbrid.ge");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='_loginButton']")).click();

	}

	public static void NoSuchFrame_Exception() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://rediff.com");

		List<WebElement> list = driver.findElements(By.tagName("iframe"));

		for (int i = 0; i < list.size(); i++) {

			System.out.println("List of iframes in webpage:= " + list.get(i).getAttribute("name"));

			if (list.get(i).getAttribute("name").equals("metric_iframe")) {
				driver.switchTo().frame(driver.findElement(By.name("metric_iframe")));

				driver.switchTo().frame("moneyiframe");

				driver.findElement(By.xpath("//*[@id='get_quote']/div/div[2]/div")).click();
				break;
			}

		}

	}

	public static void NoSuchWindow_Exception() {

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		driver.findElement(By.linkText("Plan Travel")).click();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='plan']/ul[2]/li[2]/a")));
		element.click();

		Set<String> set = driver.getWindowHandles();

		Iterator<String> itr = set.iterator();

		String winID1 = itr.next();
		String winID2 = itr.next();

		System.out.println("WindowID:= " + winID1);
		System.out.println("WindowID:= " + winID2);

		driver.switchTo().window(winID1);

		// driver.switchTo().defaultContent();

		WebDriverWait waitLink = new WebDriverWait(driver, 15);
		WebElement elementLink = waitLink
				.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Travel Information")));
		elementLink.click();

		driver.switchTo().window(winID2);
		WebDriverWait waitFlight = new WebDriverWait(driver, 15);
		WebElement elementFlight = waitFlight
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='manage']/ul[3]/li[1]/a")));
		elementFlight.click();

		System.out.println("end");
	}

	public static void NoAlertPresent_Exception() throws InterruptedException {

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebDriverWait waitMenu = new WebDriverWait(driver, 15);

		WebElement eleMenu = waitMenu.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'right click me')]")));

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		Actions act = new Actions(driver);

		act.contextClick(element).build().perform();

		WebElement box = driver.findElement(By.xpath("html/body/ul"));

		List<WebElement> list = box.findElements(By.tagName("li"));

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("Cut")) {

				// list.get(i).click();

				Thread.sleep(3000);

				Alert alert = driver.switchTo().alert();
				alert.accept();

				break;

			}

		}

	}

	public static void StaleElement_Exception() throws InterruptedException {

		/*
		 A stale element reference exception is thrown in one of two cases,
		 the first being more common than the second:
		 
		 The element has been deleted entirely. The element is no longer
		 attached to the DOM.
		 
		 */

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://github.com/");

		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

		element.sendKeys("Hello");
		element.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		element.clear();

	}

}
