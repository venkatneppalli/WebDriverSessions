package TestNGCommands_Handel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;

public class testName_Test {

	
	
	
	@Test(testName = "tc1")
	public void f() {

	}

	@BeforeMethod
	public void beforeMethod(Method method) {

		
		String test = method.getAnnotation(Test.class).testName();
		System.out.println(test);
	}

	@AfterMethod
	public void afterMethod() {

	}

}
