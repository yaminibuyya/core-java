 package com.create.iq.sahasra;

import java.util.Arrays;

public class Sorting implements Comparable<Sorting> {
	private int id;
	private String name; 
	 private double fees;
	 public Sorting(int id,String name,double fees) {
		 this .id=id;
		 this .name=name;
		 this.fees=fees;	 
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	
	

	@Override
	public String toString() {
		return "Sorting [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

	@Override
		public int compareTo(Sorting other) {
			
			//return this.id-other.id;
			 return this.getName().compareTo(other.name);
		} 


	public static void main(String[] args) {
		 Sorting s1=new Sorting(103,"mani",1200.00);
		 Sorting s2=new Sorting(105,"vinay",5600.00); 
		 Sorting s3=new Sorting(102,"sravani",9200.00);
		 Sorting s4=new Sorting(104,"sai",11200.00);
		 Sorting s5=new Sorting(101,"raju",7200.00);
		 
		 Sorting[] students= {s1,s2,s3,s4,s5};
		 Arrays.sort(students);
	for (Sorting sorting : students) {
		System.out.println(sorting);
		
	}
		 
		 
	 }

	

	
}
