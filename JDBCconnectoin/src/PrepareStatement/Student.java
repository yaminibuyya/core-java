package PrepareStatement;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private long phoneno;
	private Date DOB;
	public Student(int id, String name, long phoneno, Date dOB) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		DOB = dOB;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", DOB=" + DOB + "]";
	}
	
	
	
	
	

}
