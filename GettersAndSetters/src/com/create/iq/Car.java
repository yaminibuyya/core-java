package com.create.iq;

public class Car {
	
		public Car () {
		}
		
		 int id=2;
		 String brandname;
		  String color="red";
		 int noOfseats=7;
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
			Car car=new Car();
			car.SetBrandname("salesforce");
			System.out.println(car.brandname);
			System.out.println(car.id);
			System.out.println(car.color);
			System.out.println(car.noOfseats);
			
			

		}

	}



