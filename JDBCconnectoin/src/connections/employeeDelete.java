package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class employeeDelete {
	public static void main(String[] args) throws SQLException {
		
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "yamini");
		System.out.println(connection);
		Statement st=connection.createStatement();
		String delete="delete from employee where id=1";
		int result=st.executeUpdate(delete);
		
		System.out.println(result);
		st.close();
		connection.close();
		
	}

}