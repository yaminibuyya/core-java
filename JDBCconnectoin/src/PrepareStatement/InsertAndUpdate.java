package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertAndUpdate {

	public static void main(String[] args) throws SQLException {
		
		Connection con =null;
		PreparedStatement ps=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yamini", "root", "yamini");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ps=con.prepareStatement("insert into Person values(?,?,?,?)");
		ps.setInt(1,3);
		ps.setString(2,"damcharla");
		ps.setString(3,"sravani");
		ps.setInt(4,27);
		
		int result=ps.executeUpdate();
		System.out.println(result);
		
		ps=con.prepareStatement("update person set  last_name=? where id=?");
		ps.setString(1,"yamini");
		ps.setInt(2,7);
		int rs =ps.executeUpdate();
		System.out.println(rs);
		
		
		
		
		ps.close();
		con.close();
		
	}

}
