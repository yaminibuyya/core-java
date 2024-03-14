package persontable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TwoQUeriesAtaTime {

	public static void main(String[] args) throws SQLException {

		Driver d= new Driver();
		DriverManager.registerDriver(d);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "yamini");
		System.out.println(connection);
		Statement st=connection.createStatement();
		String insert="insert into employee values(4, 'raju', 'M')";
		String insert1="insert into employee values(5, 'ganesh', 'M')";
		String insert2="insert into employee values(6, 'nazir', 'M')";
	
		  int result=st.executeUpdate(insert);
		  int result1=st.executeUpdate(insert1);
		  int result2=st.executeUpdate(insert2);
		 
		  System.out.println(result);
		  System.out.println(result1);
		  System.out.println(result2);

	   Statement st1=connection.createStatement();
		  String update="update employee set name='eswar' where id=6";
		  int result3=st.executeUpdate(update);
		  System.out.println(result3);
		  
		  
		st.close();
		connection.close();

	}

}
