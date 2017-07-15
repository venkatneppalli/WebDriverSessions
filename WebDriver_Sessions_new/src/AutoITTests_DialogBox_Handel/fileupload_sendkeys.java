package AutoITTests_DialogBox_Handel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class fileupload_sendkeys {
    public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
			
		upload_Sendkeys();
		//Runtime.getRuntime().exec("C:\\Users\\sarit\\Desktop\\AutoIT_Script\\test.exe");
	
		
	}
	public static void upload_Sendkeys() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
	 driver =  new ChromeDriver();
	 driver.get("http://google.com"); 
	 driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Images")).click();
			
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id='qbi']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id='qbug']/div/a")).click();
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id='qbfile']")).sendKeys("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\DialogBoxAutoITTests_Handel\\test.jpg");
	}

}
