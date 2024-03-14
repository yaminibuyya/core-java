package com.createiq;

public class EmployeeDetailsWithMethods {

	
		int id;
		String name;
		String job;
		double salary;
		public void empdetails(int i,String j,String k,double l) {
			id=i;  
			name=j;
			job=k;
			salary=l;
			System.out.println("id: "+id);
			System.out.println("name: "+name); 
			System.out.println("job: "+job);
			System.out.println("salary: "+salary);
		}
      public static void main (String[] args) {
    	  EmployeeDetailsWithMethods demo=new EmployeeDetailsWithMethods();
    	  demo.empdetails(700,"Sahasra","java developer",900000);
    	  System.out.println();
    	  demo.empdetails(890,"yamini","salesforce",7000000);
    	  

			
		}
	}


