package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Test {

	
		public static Connection connection=null;
		static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yamini","root","yamini" );
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
		public static Connection getconnection() {
			return connection;
		}
		
		public static void main(String[] args) throws SQLException   {
			PreparedStatement ps=connection.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1,46556);
			ps.setString(2,"sahasra");
			ps.setString(3,"F");
			java.util.Date date=new java.util.Date(); 
			//Date date1=new Date(date.getDate());
			java.sql.Date sqdate=new java.sql.Date(date.getTime());
			//ps.setDate(4, sqdate);
			ps.setDate(4, sqdate);
			int rs=ps.executeUpdate();
			System.out.println(rs);
		}
}
