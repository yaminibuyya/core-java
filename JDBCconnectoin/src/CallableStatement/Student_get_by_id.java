package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import PrepareStatement.Test;

public class Student_get_by_id {

		public static void main(String[] args) throws SQLException {
			Connection c=Test.getconnection();
			System.out.println(c);
		
			CallableStatement cs= c.prepareCall("{call student_insert(?,?,?,?)}");
			cs.setInt(1, 1);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3,Types.VARCHAR);
			cs.registerOutParameter(4,Types.DATE);
			
		
			ResultSet rs=cs.executeQuery();
			while (rs.next()) {
				//System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDate(4));
			}
			//System.out.println(rs);

	}

}
