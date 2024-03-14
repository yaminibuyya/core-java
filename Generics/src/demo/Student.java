package demo;

public class Student {
	int id;
	String name;
	double fees;
	public void m1(int id,String name,double fees) {
//		this.id=id;
//		this.name=name;
//		this.fees=fees;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.m1(7, "yamini", 89000.00);
		System.out.println(s1);
		//s1.m1(0, null, 0);
	}

}
