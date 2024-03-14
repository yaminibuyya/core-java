package DeepClone;

public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad=new Address("LB nagar","hyd");
		Department dep=new Department("developer", "high Security Zone", 7);
		Employee emp=new Employee(24, "Sahasra", 70000.00, ad,dep);
		System.out.println("Employee Details: "+emp);
		Employee cloning=(Employee)(emp.clone());
		//emp.setName("rani")
		System.out.println("cloned Data: "+cloning);
		emp.setName("rani");
		emp.getAddress().setState("khammam");//Address class loki velli get it and set the give updated value
		emp.getDepartment().setName("Testing");
		System.out.println("changed original: "+emp);
		System.out.println("clone After updated: "+cloning);
		
		
	}
	}


