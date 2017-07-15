package TextBox_Handel;



import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterInputValues {

	public static void main(String[] args) {
		String str,str1;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid user Name : ");
		str=sc.nextLine();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(str);
		System.out.println("Enter valid Password : ");
		str1=sc.nextLine();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(str1);
		driver.findElement(By.xpath("//*[@id='PersistentCookie']")).click();
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	
	
     
    System.out.println("The input String is :"+str);

	}

}
