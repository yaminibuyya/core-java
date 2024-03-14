package Com.DAO;

public class student {
	private int id;
	private String name;
	private String email;
	private int fees;
	public student(int id, String name, String email, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", email=" + email + ", fees=" + fees + "]";
	}
	
	
	

}
