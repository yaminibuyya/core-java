package cloning;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;	
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

	public double getSalary() {
		return salary;
	}


//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalary()=" + getSalary() + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee OriginalObject=new Employee(4, "sahasra", 5678990.00);
		System.out.println("original Data: "+OriginalObject);
		//OriginalObject.setId(7999);
		Employee cloneObject=(Employee)(OriginalObject.clone());
		OriginalObject.setId(7999);
		System.out.println("Cloned Object: "+cloneObject);
		System.out.println("original data: "+OriginalObject);
		System.out.println("cloned: "+cloneObject);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
