package TestNGCommands_Handel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethods_1 {

	
		@BeforeMethod
		public void fmethods(){
			
			System.out.println("fmethods");
			
		}
		
		@Test(dependsOnMethods="smethods")
		public void methods(){
			
			System.out.println("methods");
			
		}
		
		@Test
		public void smethods(){
			
			System.out.println("smethods");
			
		}

}
