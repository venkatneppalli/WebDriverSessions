package JavaScriptExecutor_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class javascript_executor {

	public  static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkateswararao.n\\Desktop\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	
    	 //ClickButton_keys();
    	 
    	 //EnterTextField_keys();
    	 
    	 WebTitle_keys();
    	 ClickButton_JS();
	}
	
	
	public static void ClickButton_JS() throws InterruptedException{
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick");
    	driver.manage().window().maximize();
		
    	driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
    	Thread.sleep(3000);
    	WebElement element = driver.findElement(By.xpath("//*[text(),'Click me']"));
		Thread.sleep(3000);
		//element.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void ClickButton_keys() throws InterruptedException{
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_get");
    	driver.manage().window().maximize();
		
    	driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
    	Thread.sleep(3000);
    	WebElement element = driver.findElement(By.id("myBtn"));
		Thread.sleep(3000);
		//element.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void EnterTextField_keys() throws InterruptedException{
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_text_get");
    	driver.manage().window().maximize();
		
    	driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
    	Thread.sleep(3000);
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('myText').value='my text'");
		
	}
	

	public static void WebTitle_keys() throws InterruptedException{
		driver.get("http://www.adactin.com/HotelApp/");
    	driver.manage().window().maximize();
		
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	String sText =  js.executeScript("return document.title;").toString();
    	System.out.println("Web Page Title:= "+sText);
		
	}
	
	
}
