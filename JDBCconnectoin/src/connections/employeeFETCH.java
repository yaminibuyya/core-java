package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class employeeFETCH {

	public static void main(String[] args) throws SQLException {
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "yamini");
		//System.out.println(connection);
		Statement st=connection.createStatement();
		String fetch="select * from employee"+" limit 2";
		 ResultSet rs=st.executeQuery(fetch);
		 while(rs.next()) {
			 System.out.println("ID: "+rs.getInt("id"));
			 System.out.println("NAME: "+rs.getString("name"));
			 System.out.println("gender: "+rs.getString("gender"));
				 
		 }
		 st.close();
		 rs.close();
		 connection.close();
		

	}

}
