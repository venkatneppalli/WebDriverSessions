package Buttons_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		//Click_Button();
		Click_Button();
	}
	
	public static void Click_Button(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactin.com/HotelApp/");
		
		driver.findElement(By.id("login")).click();;
		
	}
	
	

}
