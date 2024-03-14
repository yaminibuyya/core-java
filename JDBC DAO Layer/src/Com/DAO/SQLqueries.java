package Com.DAO;

public class SQLqueries {
	static String create=("create table phone(id int,mobilename varchar(60),price int)");
	static String insert = "insert into student values (?,?,?,?)";
	static String update = "update student set name=? where id=?";
	static String delete = "delete from student where id=?";
	static String select = "select * from student";
	static String getByname = " select * from student where name=?";
	static String getByid = " select * from student where id=?";

}
