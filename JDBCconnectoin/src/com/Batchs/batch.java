package com.Batchs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class batch {
	   static Connection con=null;

	    public static void main(String[] args) {
	        // transaction management
	        con=MyConnection.getConnect();
	        try {
	            
	            
	            con.setAutoCommit(false);
	            
	            
	            String sql="insert into person values(?,?,?,?)";
	            PreparedStatement ps=con.prepareStatement(sql);
	            
	            ps.setInt(1, 4);
				ps.setString(2,"alla");
				ps.setString(3,"kriti");
				ps.setInt(4,40);
	            
	            ps.addBatch();
	            
	            
	            //pr.executeBatch();
	            
	            String up="update person set first_name='damcharla' where id=100";
	            PreparedStatement update=con.prepareStatement(up);
	            update.addBatch();
	            
	            
	            int [] b = update.executeBatch();
	            System.out.println(b);
	            
	            int a[]=ps.executeBatch();
	            System.out.println(a);
	            
	            
//	            for (int i : a) {
//	                System.out.println(i+":row inserted");
//	            }
	            
	            
	            con.commit();
	            
	            //with out rollback we perform queries if insert query ok  but update query is wrong
	            //then execute the inserted even fail the updation
	        } catch (SQLException e) {
	          try {
	            con.rollback();
	            System.out.println("roll backed");
	            
	        } catch (SQLException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }finally {
	            try {
	                con.close();
	            } catch (SQLException e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            }
	        }
	        
	    }
	    }

}
