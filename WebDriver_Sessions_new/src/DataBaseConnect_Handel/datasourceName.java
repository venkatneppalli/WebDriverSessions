package DataBaseConnect_Handel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class datasourceName {

	
	//create odbc datasourceName
	//change the database name
	//write below query
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			
		
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection connection = DriverManager
                 .getConnection("jdbc:odbc:test");

         System.out.println("DATABASE NAME IS:"
                 + connection.getMetaData().getDatabaseProductName());
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement
                 .executeQuery("select idsno from ids");
         while (resultSet.next()) {
             System.out.println("EMPLOYEE NAME:"
                     + resultSet.getString("idsno"));
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
     
	}
}


