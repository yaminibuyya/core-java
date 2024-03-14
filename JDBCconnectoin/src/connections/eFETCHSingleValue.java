package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class eFETCHSingleValue {

	public static void main(String[] args) throws SQLException {
		Driver d= new Driver();
		DriverManager.registerDriver(d);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "yamini");
		System.out.println(connection);
		Statement st=connection.createStatement();
		String selectQuery = "select * from employee where id=2";
		ResultSet rs = st.executeQuery(selectQuery);
		while (rs.next()) { 
		 System.out.println("ID: "+rs.getInt(1));
		 System.out.println("NAME: "+rs.getString(2));
		 System.out.println("gender: "+rs.getString(3));
			
		}
		st.close();
		rs.close();
		connection.close();


	}

}
