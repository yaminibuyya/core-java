package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import PrepareStatement.Test;

public class Student_insert {

	public static void main(String[] args) throws SQLException {
		Connection c=Test.getconnection();
		System.out.println(c);
	
		
		CallableStatement cs=c.prepareCall("{call student_insert(?,?,?,?)} ");
		cs.setInt(1, 2);
		cs.setString(2,"sahana");
		cs.setString(3,"sahana@gmail.com");
		java.util.Date date=new java.util.Date();
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		cs.setDate(4,sqldate);
		 
		cs.executeUpdate();
		System.out.println(cs);
		

	}

}
