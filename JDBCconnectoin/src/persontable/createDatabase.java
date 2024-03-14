package persontable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class createDatabase {
	public static void main(String[] args) throws SQLException {
		 
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "yamini");
		System.out.println(c);
		Statement st=c.createStatement();
		String query="create database demo";
		 int result=st.executeUpdate(query);
		 System.out.println(result);
		 
		st.close();
		c.close();
		
	}

}
