package com.Batchs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransiantRollback {
	static Connection con=null;
	static PreparedStatement ps=null;
	static PreparedStatement ps1=null;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","yamini");
			con.setAutoCommit(false);
			
			 ps=con.prepareStatement("insert into person values(?,?,?,?)");
			ps.setInt(1, 2300);
			ps.setString(2,"rajesh");
			ps.setString(3,"rajesh@gmail.com");
			ps.setInt(4,90000);
			
			ps.addBatch();
			
			int a[]=ps.executeBatch();
			System.out.println("inserted: " +a);
			
			 ps1=con.prepareStatement("update person set email=? where id=?");
			ps1.setString(3,"ramsi@gmail.com");
			ps1.setInt(2, 102);
			
			ps1.addBatch();
			
			
			int rs[]=ps1.executeBatch();
			System.out.println(rs);
			
		con.commit();
		
		
		}  
		catch (ClassNotFoundException | SQLException e) {
			try {
				con.rollback();
				System.out.println("error was occured");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
				ps1.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	
	
	

}
