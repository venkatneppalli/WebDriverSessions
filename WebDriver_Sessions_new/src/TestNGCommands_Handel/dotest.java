package TestNGCommands_Handel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dotest {
	
	
	@BeforeClass
	public void bseting(){
		
		System.out.println("Print beforeclass");
		
	}
	
	@BeforeMethod
	public void methodtest(){
		
		System.out.println("Print beforemethod");
		
	}
	
	
	@Test
	public void test1(){
		
		System.out.println("Print test1");
		
	}

}
