package PrepareStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class writeImage {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","yamini");
		
		PreparedStatement ps=con.prepareStatement("insert into image(pic) values(?)");
		
		FileInputStream fis =new FileInputStream("C:\\Users\\sahasra yamini\\Pictures\\animal-4085255__340.jpg");
		ps.setBinaryStream(1, fis,fis.available());
		ps.executeUpdate();  
		System.out.println("done....");
		
	}
	
	

}
