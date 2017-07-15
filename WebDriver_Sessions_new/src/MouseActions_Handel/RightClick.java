package MouseActions_Handel;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		ContextClick_Menu();
	}

	public static void right_Click() {

		driver = new ChromeDriver();

		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.xpath("//*[@id='addlang']/a[2]"));

		Actions acts = new Actions(driver);

		acts.contextClick(element).perform();

	}

	public static void ContextClick_Menu() throws InterruptedException {

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

				list.get(i).click();

				Thread.sleep(3000);

				Alert alert = driver.switchTo().alert();
				alert.accept();

				break;

			}

		}

	}

}
