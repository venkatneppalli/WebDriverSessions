package ExcelFile_ReadWrite_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_HotelApp {

	public static WebDriver driver;
	//public static Xls_Reader xls;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		
		
		login_app();
		//search_hotel();
	
		
	}

	public static void login_app() throws InterruptedException {
		
		
		Xls_Reader xls = new Xls_Reader("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");
		String rmode = xls.getCellData("Sheet1", "RunMode", 2);
		System.out.println(rmode);
		if (rmode.equals("Yes")) {
			String uname = xls.getCellData("Sheet1", "Username", 2);
			System.out.println(uname);
			String pwd = xls.getCellData("Sheet1", "Password", 2);
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys("");
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys(uname);
			
			driver.findElement(By.id("password")).sendKeys(pwd);
			Thread.sleep(3000);
			driver.findElement(By.id("login")).click();
			Thread.sleep(3000);
		}
		else{
			System.out.println("Run Mode is No");
		}
	

	}
	
	public static void search_hotel(){
		try{
			
			Xls_Reader xls = new Xls_Reader("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");
			WebElement location = driver.findElement(By.id("location"));
			List<WebElement> locationvalue = location.findElements(By.tagName("option"));
			for(int i = 0; i < locationvalue.size(); i++){
				String loc = xls.getCellData("Sheet1", "Location", 3); 
				if (loc.equals(locationvalue.get(i).getText())){
					locationvalue.get(i).click();
					break;
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
