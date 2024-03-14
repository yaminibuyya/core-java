package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectStudent {

		public static void main(String[] args) throws SQLException {
			//
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sravani", "root", "yamini");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			String selectQuery = "select * from student ";
			ResultSet rs = statement.executeQuery(selectQuery);
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getLong(5));
				System.out.println(rs.getString(6)); 
				System.out.println(rs.getString(7));
				System.out.println(rs.getInt(8));
				System.out.println(rs.getInt(9));
			}
			rs.close();
			statement.close();
			connection.close();

		}

	
}
