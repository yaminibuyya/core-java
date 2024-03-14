package persontable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class createTable {
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yamini", "root", "yamini");
		System.out.println(connection);
		Statement statement = connection.createStatement();
	    String sqltabel="create table phone"+"(id INTEGER, "+"  name varchar(50), "+" price INTEGER)";
	     int result=statement.executeUpdate(sqltabel);
	    System.out.println(result);
	    
	    statement.close();  
	    connection.close();
	}
	

}
