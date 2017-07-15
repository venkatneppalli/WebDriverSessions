package TakeScreenShots_Handel;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SingleElmt {

	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		//System.setProperty("webdriver.ie.driver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/webhp?hl=en&noj=1");
		Thread.sleep(3000);
		
		 // Find the text input element by its name
        WebElement element = driver.findElement(By.xpath("//*[@id='gbqfq']"));
       // WebElement element=driver.findElement(By.name("q"));
		//WebElement element = driver.findElement(By.xpath("//*[@id='hplogo']"));
      
        
        // Enter something to search for
        element.sendKeys("gmail");
      
        
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Point p = element.getLocation();

        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        Rectangle rect = new Rectangle(width, height);

        BufferedImage img = null;
        img = ImageIO.read(screen);

        BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width,rect.height);

        ImageIO.write(dest, "png", screen);
        FileUtils.copyFile(screen, new File("D:\\srinu\\scr.jpg"));

		

	}

}
