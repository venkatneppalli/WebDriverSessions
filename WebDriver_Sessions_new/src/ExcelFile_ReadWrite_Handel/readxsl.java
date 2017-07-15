package ExcelFile_ReadWrite_Handel;

import ExcelFile_ReadWrite_Handel.Xls_Reader;

public class readxsl {

	
	public static Xls_Reader suitxls;
	
	public static void main(String[] args) {

		
		suitxls =new Xls_Reader("C:\\Workspace\\WebDriver_Sessions\\src\\readwrite_xsl\\Test.xlsx");
		int m=suitxls.getRowCount("Sheet1");
		int n=suitxls.getColumnCount("Sheet1");
		System.out.println(" --->"+m);
		System.out.println(" --->"+n);
		System.out.println("Row count= "+suitxls.getRowCount("Sheet1"));
		
		
		System.out.println("Col count= "+suitxls.getColumnCount("Sheet1"));
		
		for(int i=2;i<=suitxls.getRowCount("Sheet1");i++){
		
		
			for(int j=0;j<suitxls.getColumnCount("Sheet1");j++){
			
				System.out.println("Employee detl= "+suitxls.getCellData("Sheet1", j, i));
			
		}
			
			
			
			//System.out.println(suitxls.getCellData("Employees", "colName", i));
			
		}
		
		
		
		
		

	}

}
