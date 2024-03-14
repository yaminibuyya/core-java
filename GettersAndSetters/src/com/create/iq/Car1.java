package com.create.iq;

public class Car1 {
	
	 int id;
	 String brandname;
	  String color;
	 int noOfseats;
	 public Car1(int id,String color,int noOfseats) {
		 this.id=id;
		 this.color=color;
		 this.noOfseats=noOfseats;
	 }
	 
	 
	 public void SetBrandname(String brandname) {
		 this.brandname=brandname;
	 }
	 public int getid() {
		  return this.id;
	 }
	 public String getcolor() {
		  return this.color;
	 }
	 public int getnoOfseats() {
		  return this.noOfseats;
	 }
	 
	public static void main(String[] args) {
		Car1 car=new Car1(12,"black",9);
		car.SetBrandname("reliance");
		System.out.println(car.brandname);
		System.out.println(car.id);
		System.out.println(car.color);
		System.out.println(car.noOfseats);
		
		

	}

}





