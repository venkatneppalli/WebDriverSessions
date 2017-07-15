package PageObjectModel_PageFactory;

import org.testng.annotations.Test;

public class Login_Test extends Base_Test {
	
	
	
	@Test
	public void doLogin(){
	
		
		init();
		
		Launch_Page launch_page = new Launch_Page(driver);
		
		launch_page.gotoLogin();
		
	}
	
	
	
	

}
