package Robot_DialogBox_Handel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class savefiles {

	/**
	 * @param args
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium_jars\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		//ttesting528
		//Password72
		
		driver.manage().window().maximize();
		
		//GMAIL Login for testing
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ttesting528");
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Password72");
		
		Thread.sleep(2000);
		
		//Verify check box is already checked
		WebElement vf = driver.findElement(By.xpath("//*[@id='PersistentCookie']"));
		
		
		
		//vf.click();
		
		Thread.sleep(2000);
		
		
		
		
		
		if(vf.isSelected()){
			
			vf.click();
			System.out.println("Print checked status:= "+vf.isSelected());
			
			
		}
		
	
		
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
		Thread.sleep(2000);
		
		//Click on Compose button
		driver.findElement(By.xpath("//*[@id=':4z']/div/div")).click();
		
		//*[@id=':4r']/div/div
		
		Thread.sleep(2000);
		
		//Attachment link
		WebElement ele = driver.findElement(By.xpath("//*[@id=':az']"));
		
		
		Robot robot = new Robot();
		
		ele.sendKeys("D:\\upload_files\\sample.jpg");
		
		Thread.sleep(2000);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_S);
		
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_S);


		System.out.println("End");
		
		
		
	}

}
