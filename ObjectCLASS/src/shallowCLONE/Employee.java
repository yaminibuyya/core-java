package shallowCLONE;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;
	private Address address;
  
	public Employee(int id,String name,double salary,Address address) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	
}
