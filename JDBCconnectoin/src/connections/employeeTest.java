package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class employeeTest  {
	public static void main(String[] args) throws SQLException {
		
	employee e =new employee(1, "sahasra", "F");
	Driver d= new Driver();
	DriverManager.registerDriver(d);
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "yamini");
	System.out.println(connection);
	Statement st=connection.createStatement();
	String insert="insert into employee values(1, 'sahasra', 'F')";
	String insert1="insert into employee values(2, 'yamini', 'F')";
	String insert2="insert into employee values(3, 'manish', 'M')";
	
	  int result=st.executeUpdate(insert);
	  int result1=st.executeUpdate(insert1);
	  int result2=st.executeUpdate(insert2);
	  
	  System.out.println(result);
	  System.out.println(result1);
	  System.out.println(result2);
	 
	
	st.close();
	connection.close();
	
}
}

