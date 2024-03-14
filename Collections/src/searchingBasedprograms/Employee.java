package searchingBasedprograms;

import java.util.ArrayList;

public class Employee {
		private int empId;
		private String empName;
		private int empSalary;
		DepartmentClass dep;
		
		

		public Employee(int empId, String empName, int empSalary, DepartmentClass dep) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.dep = dep;
		}
		
		



		public int getEmpId() {
			return empId;
		}





		public void setEmpId(int empId) {
			this.empId = empId;
		}





		public String getEmpName() {
			return empName;
		}





		public void setEmpName(String empName) {
			this.empName = empName;
		}





		public int getEmpSalary() {
			return empSalary;
		}





		public void setEmpSalary(int empSalary) {
			this.empSalary = empSalary;
		}





		public DepartmentClass getDep() {
			return dep;
		}





		public void setDep(DepartmentClass dep) {
			this.dep = dep;
		}





		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dep=" + dep + "]";
		}





		public static void main(String[] args) {
			DepartmentClass dp1=new DepartmentClass(1, "Marketing");
			DepartmentClass dp2=new DepartmentClass(2, "sales");
			DepartmentClass dp3=new DepartmentClass(3, "Engineering");
			
			Employee emp1=new Employee(1, "a", 30000, dp1);
			Employee emp2=new Employee(2, "b", 30000, dp1);
			Employee emp3=new Employee(3, "c", 30000, dp1);
			
			Employee emp4=new Employee(1, "d", 60000, dp3);
			Employee emp5=new Employee(2, "e", 30000, dp3);
			Employee emp6=new Employee(3, "f", 60000, dp3);
			
			Employee emp7=new Employee(1, "i", 60000, dp2);
			Employee emp8=new Employee(2, "k", 30000, dp2);
			Employee emp9=new Employee(3, "f", 60000, dp2);
			
			//create a list
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(emp1);
			list.add(emp2);
			list.add(emp3);
			list.add(emp4);
			list.add(emp5);
			list.add(emp6);
			list.add(emp7);
			list.add(emp8);
			list.add(emp9);
			
			for (Object obj : list) 
			{
				System.out.println("All Employee list:"+obj);
			}
			
			System.out.println("*****************************");
			System.out.println("print emp details whose dep is 3");
			
			for(Employee dpe:list)
			{
				if(dpe.getDep()==dp2)
				{
					System.out.println(dpe);
				}
			}
		}

	}


