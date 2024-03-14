package PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class customDate {

	public static void main(String[] args) throws SQLException, ParseException {
		Student s=new Student(1,"moto",25000,new Date());
		Connection connection=Test.getconnection();
		System.out.println(connection);
		
		PreparedStatement ps=connection.prepareStatement("insert into phone values(?,?,?,?)");
		ps.setInt(1,s.getId());
		ps.setString(2,s.getName());
		ps.setLong(3,s.getPhoneno());
		
		String dob="29/04/1997";
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date jd=sd.parse(dob);
		java.sql.Date sqldate=new java.sql.Date(jd.getTime());

		
		ps.setDate(4,sqldate);	
		int result=ps.executeUpdate();
		System.out.println(ps);

	}

} 
