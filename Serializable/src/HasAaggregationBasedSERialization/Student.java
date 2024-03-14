package HasAaggregationBasedSERialization;

import java.io.Serializable;

public class Student implements Serializable {
	public String name;
	public int rollnumber;
	public Address address;
	
	public Student(String name,int rollnumber,Address address) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", address=" + address + "]";
	}
	

}
