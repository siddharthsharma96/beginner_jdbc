//step 4 insert
package jdbc.genx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcinsert {
public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		Statement stmt=null;
		String qry = "insert into genx.salary values(4,'Afsar',10000,'Afsar@gen-xt.com')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Class Loaded");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=7011630679");
			
			System.out.println("Connetion Establish with db server");
			
			stmt=con.createStatement();
			System.out.println("Platform Created");
			
			stmt.executeUpdate(qry);
			System.out.println("Data Inserted");
			
		}catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(stmt!=null)
			{
				try {
					stmt.close();
					System.out.println("Closed All Resources");
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
			if(con!=null)
			{
				try {
					con.close();
					System.out.println("Closed All Resources");
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		
	}
}
