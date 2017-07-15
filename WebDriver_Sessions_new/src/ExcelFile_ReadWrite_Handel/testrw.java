package ExcelFile_ReadWrite_Handel;

import java.util.ArrayList;

public class testrw {

public static Xls_Reader xls;

	
	public static void main(String[] args) {
		
		
		xls=new Xls_Reader("C:\\Workspace\\WebDriver_Sessions\\src\\readwrite_xsl\\Test.xlsx");
		
		
		
		System.out.println("get size of column: "+xls.getColumnCount("Sheet1"));
		
		System.out.println("get size of rows: "+xls.getRowCount("Sheet1"));
		
		//reading
		for(int i=2;i<xls.getRowCount("Sheet1");i++){
			
			
			for(int j=0;j<xls.getColumnCount("Sheet1");j++){
				
				
				System.out.println("print vlaues: "+xls.getCellData("Sheet1", j, i));
				
			}
		}

		
		
		//writing into xls
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("name1");
		list.add("name2");
		list.add("name3");
		list.add("name4");
		list.add("name5");
		
		for(int i=0;i<list.size();i++){
			
			xls.setCellData("Sheet1", "venkat", i+2, list.get(i));
		
			
		}
		
		
		
		
		
		
	}

}
