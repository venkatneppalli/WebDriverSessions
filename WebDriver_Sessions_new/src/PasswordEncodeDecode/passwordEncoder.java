package PasswordEncodeDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passwordEncoder {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();
		
		WebElement pwd = driver.findElement(By.id("password"));

		byte[] encodedBytes = Base64.encodeBase64("password1".getBytes());
		System.out.println("encodedBytes "+ new String(encodedBytes));

		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		System.out.println("decodedBytes "+ new String(decodedBytes));

		pwd.sendKeys(new String(encodedBytes));

	}

}
