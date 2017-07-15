package DownloadUploadfiles_AutoIT_Handel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_alters {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Runtime.getRuntime().exec("C:\\NewWorkSpace\\WebDriver_Sessions\\AuthenticationHandli\\records.exe");
		
		driver.get("http://usresp-qa.protectyourbubble.com/");
		
		

	}

}
