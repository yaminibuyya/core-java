 package com.Batchs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import PrepareStatement.Test;

public class personINandUP {
		Connection con=null;
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","yamini");
			 con.setAutoCommit(false); 
		
		
		 PreparedStatement psinsert=con.prepareStatement("insert into person values(?,?,?,?)");
		psinsert.setInt(1,106);
		psinsert.setString(2,"mani");
		psinsert.setString(3,"mani@gmail.com");
		psinsert.setString(4,"telangana");
		
	
		
		 PreparedStatement psupdate=con.prepareStatement("update person set name=? where id=?");
		psupdate.setString(1,"sAI");
		psupdate.setInt(2,10);
		
	
		psinsert.addBatch();
		psupdate.addBatch();
		
		psinsert.executeBatch();
		psupdate.executeBatch();

	con.commit();
		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			con.rollback();
			e.printStackTrace();
		} 
	}

}
