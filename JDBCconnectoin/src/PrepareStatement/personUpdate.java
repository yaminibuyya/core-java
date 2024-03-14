package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class personUpdate {
	public static void main(String[] args) throws SQLException {
		
	
	Driver d=new Driver();
	DriverManager.registerDriver(d);
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/yamini", "root", "yamini");
	System.out.println(connection);
	PreparedStatement ps=connection.prepareStatement("Update person set last_name=? where id=?");
	
	ps.setString(1,"sai krishna");
	ps.setInt(2, 1);
	int result=ps.executeUpdate();
	System.out.println(ps);
	
	
	ps.close();
	connection.close();

}
}