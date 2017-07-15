package PageObjectModel_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Launch_Page extends Base_Page {

	public Launch_Page(WebDriver driver) {

		super(driver);

	}

	public Login_Page gotoLogin() {

		driver.get("http://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();

		return PageFactory.initElements(driver, Login_Page.class);
	}

}
