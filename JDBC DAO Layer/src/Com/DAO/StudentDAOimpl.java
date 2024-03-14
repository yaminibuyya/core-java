package Com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOimpl implements StudentDao {
     static Connection con=null;
     static PreparedStatement ps;
 	static ResultSet rs;
    
	@Override
	public void save(student s) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLqueries.insert);
			ps.setInt(1, s.getId());
			ps.setString(2,s.getName());
			ps.setString(3,s.getEmail());
			ps.setInt(4,s.getFees());
			int result = ps.executeUpdate();
			System.out.println("Inserted rows: "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private int getfees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(student s) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLqueries.update);
			ps.setString(1, "krishna");
			ps.setInt(2, 1);
			int result=ps.executeUpdate();
			System.out.println("updated data: "+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
	con=MyConnection.getConnect();
	try {
		ps=con.prepareStatement(SQLqueries.delete);
		ps.setInt(1, 4);
		int result=ps.executeUpdate();
		System.out.println("delete the row: "+result);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}




	@Override
	public student findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public student getByname(String name) { 
		con=MyConnection.getConnect();
		
		try {
			ps=con.prepareStatement(SQLqueries.getByname);
			ps.setString(1, name);
			rs=ps.executeQuery();
			//
			student st=null;
			while(rs.next()) {
				st = new student(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getInt("fees"));
			}
			return st;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			MyConnection.closeConnect(con, ps);

		}
		return null;
	}

	@Override
	public student getByid(int id) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLqueries.getByid);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			
			
			student st=null;
			while(rs.next()) {
				st = new student(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getInt("fees"));
			}
			return st;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			MyConnection.closeConnect(con, ps);

		}
		 
		return null;
	}

	@Override
	public void create(phone p) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLqueries.create);
			int result=ps.executeUpdate();
			System.out.println("created succesfully:"+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void InsertList() {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLqueries.insert);
			
			student s4=new student(4, "ranthadeeep", "ratha@gmail.com", 500000);
			student s5=new student(5, "ujith", "ujith@gmail.com", 1300000);
			student s6=new student(6, "farah", "farah@gmail.com", 70000);
			student s7=new student(7, "harish", "harish@gmail.com", 500000);
			
			List<student> list=new ArrayList<>();
			list.add(s4);
			list.add(s5);
			list.add(s6);
			list.add(s7);
			
			for(student std:list) {
				ps.setInt(1,std.getId());
				ps.setString(2,std.getName());
				ps.setString(3,std.getEmail());
				ps.setInt(4,std.getFees());
			

			 int result=ps.executeUpdate();
		     System.out.println("inserted rows : "+result);
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

