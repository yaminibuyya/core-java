package DeepClone;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;
	private Address address;
	private Department dep;
  
	public Employee() {
		
	}
	public Employee(int id,String name,double salary,Address address,Department dep) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.dep=dep;
	}

	public Department getDepartment() {
		return dep;
	}

	public void setDepartment(Department dep) {
		this.dep = dep;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
    


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", dep=" + dep
				+ ", getDep()=" + getDepartment() + ", getId()=" + getId() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + ", getAddress()=" + getAddress() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cloned=(Employee) super.clone();//here we get it from parent object class
		cloned.setAddress((Address)cloned. getAddress().clone());
		cloned.setDepartment((Department)cloned.getDepartment().clone());
		return cloned;
}
	
	
	
}
