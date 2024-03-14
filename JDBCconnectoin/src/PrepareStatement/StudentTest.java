package PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentTest {
	public static void main(String[] args) throws SQLException {
		
	Student s=new Student(2,"iphone",200000,new Date());
	Connection connection=Test.getconnection();
	System.out.println(connection);
	
	PreparedStatement ps=connection.prepareStatement("insert into phone values(?,?,?,?)");
	ps.setInt(1,s.getId());
	ps.setString(2,s.getName());
	ps.setLong(3,s.getPhoneno());
	java.util.Date date=new java.util.Date();
	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	ps.setDate(4,sqldate);	
	int result=ps.executeUpdate();
	System.out.println(ps);

}
}