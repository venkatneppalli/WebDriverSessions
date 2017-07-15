package ReflectionAPI_Handel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverScript_Test {

	public static Method method[];
	public static ExtentTest logger;
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		DriverScript_Test d = new DriverScript_Test();
		d.start_test();
		
	}
	
	public static void start_test() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Xls_Reader xls = new Xls_Reader("C:\\Users\\venkateswararao.n\\Desktop\\DEMO.xlsx");
		
		//int rCount=xls.getRowCount("Test Steps");
		
		MyKeywords keywords = new MyKeywords();
		
		method = keywords.getClass().getMethods();
		
		//System.out.println("Methods Size:= "+method.length);
		
		//boolean MethodPresent = false;
		
		
		for(int i=2;i<=xls.getRowCount("Test Steps");i++){
			
			String currentKeywords=xls.getCellData("Test Steps", "Keyword", i);
			
			String object=xls.getCellData("Test Steps", "Object", i);
			
			
			String data=xls.getCellData("Test Steps", "Data", i);
			
			System.out.println("method names in xls:= "+object);
			System.out.println("method names in xls:= "+data);
			
			//System.out.println("method names in xls:= "+currentKeywords);
			
			
			for(int j=0;j<method.length;j++){
				
				if(method[j].getName().equals(currentKeywords)){
					
					System.out.println("Method Names:= "+method[j].getName());
					method[j].invoke(keywords, object,data);
				}
			}
		
		}
	
		MyKeywords d = new MyKeywords();
		d.report_test();

	}
	
}
