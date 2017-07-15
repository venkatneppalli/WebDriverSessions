package ExtentReports_Handling;

import java.util.Date;



import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportManager {

	public static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		
		if (extent == null) {
			Date d = new Date();
			
			String filename=d.toString().replace(":", "_").replace(" ", "_")+".html";
			
			String reporname="D:\\newreport\\"+filename;
			
			extent = new ExtentReports(reporname, true, DisplayOrder.NEWEST_FIRST);
	
		}
		
		
		return extent;
	}
	
	
	
}
