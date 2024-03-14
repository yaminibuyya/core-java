package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import PrepareStatement.Test;

public class Add_Two_Numbers {
	public static void main(String[] args) throws SQLException {
		Connection con=Test.getconnection();
		System.out.println(con);
	
		CallableStatement cs =con.prepareCall("{call add_two_numbers(?,?,?)}");
		cs.setInt(1, 100);
		cs.setInt(2, 40);
		cs.registerOutParameter(3,Types.INTEGER);
		cs.executeUpdate();
		System.out.println(cs.getInt(3));
		
		
	}

}
