package TestNGCommands_Handel;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testannotations {
	
	
	@BeforeClass
	public void loginTest(){
		
		System.out.println("Print login test");
		
		
	}
	
	
	
	@Test
	public void test1(){
		
		System.out.println("Print test1");
		String actl="test";
		Assert.assertEquals("test", actl);
	}

	@Test
	public void test2(){
		
		System.out.println("Print test2");
		String actl="test1";
		Assert.assertEquals("test", actl);
	}
	
	@AfterClass
	public void logOutTest(){
		
		System.out.println("Print logOut test");
		
	}
	
	
}
