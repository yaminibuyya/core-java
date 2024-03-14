package shallowCLONE;

public class EmpDetails {
	public static void main(String[]args) throws CloneNotSupportedException {
		Address address=new Address("kandukur", "prakasham");
		Employee emp=new Employee(1, "sahasra", 96578.00, address);
		System.out.println("Employee Details: "+emp);
		Employee cloned=(Employee)emp.clone();
		System.out.println("cloned data : "+cloned);
		emp.setName("yashi");
		//emp.setId(2);
		emp.getAddress().setcity("rajamundry");
		System.out.println("original : "+emp);
		System.out.println("cloned : "+cloned);
	}

}
