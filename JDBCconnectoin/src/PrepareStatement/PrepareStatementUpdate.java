package PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class PrepareStatementUpdate {
	public static void main(String[] args) throws SQLException {
		//Student s=new Student(1,"moto",25000,new Date());
		Connection connection=Test.getconnection();
		System.out.println(connection);
		
		PreparedStatement ps=connection.prepareStatement("Update phone set name=? where id=?");
		ps.setInt(1,1);
		ps.setString(2,"iphone");
		ps.setLong(3,25000);
		java.util.Date date=new java.util.Date();
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		ps.setDate(4,sqldate);	
		int result=ps.executeUpdate();
		System.out.println(result);

	}

}
