package Com.DAO;

//import java.util.List;

public interface StudentDao {
	void create (phone p);
	void save(student s);

	void update(student s);

	void delete(int id);

	void InsertList();

	student findByName(String name);

	student getByname(String name);
	
	student getByid(int id);
	
	

}
