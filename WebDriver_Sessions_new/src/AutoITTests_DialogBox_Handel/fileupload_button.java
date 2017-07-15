package AutoITTests_DialogBox_Handel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload_button {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		//sendkeys_method1();
		sendkeys_method2();
	}

	public static void sendkeys_method1() throws InterruptedException, IOException {
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(),'Add files...')]")).submit();;
		
		Runtime.getRuntime().exec("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\DialogBoxAutoITTests_Handel\\uploadfile.exe");
		
		System.out.println("execution completed");
		
	}
	
	public static void sendkeys_method2() throws InterruptedException, IOException {
		driver.get("http://jsfiddle.net/vacidesign/ja0tyj0f/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("/html/body/input")).click();;
		
		Runtime.getRuntime().exec("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\DialogBoxAutoITTests_Handel\\uploadfile.exe");
		
		System.out.println("execution completed");
		
	}

	
	

}
