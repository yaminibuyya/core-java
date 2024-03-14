package com.USE.A;

		import java.util.Arrays;

public class CustomerTest{
	
	
	
	public static void main(String[] args) {
			Customers c1=new Customers(2, "suri", "jadi", 2500.00);
			Customers c2=new Customers(1, "gayi", "jumbidi", 2400.00);
			Customers c3=new Customers(4, "sandy", "jadi", 1300.00);
			Customers c4=new Customers(3, "roja", "Duguta", 1500.00);
			
			
			Customers	[]customers={c1,c2,c3,c4};
			
			Arrays.sort(customers);
			for (Customers customers2 : customers) {
				System.out.println(customers2);
			}
		
	}
}

		