package com.createiq;

public class CarDetails {

	
		String name;
		int budget;
		int noofseats;
		String type;
		String color;
		
		public CarDetails() {
			
		}
		
	
		public CarDetails(String name,int budget,int noofseats,String type,String color) {
			this.name=name;
			this.budget=budget;
			this.noofseats=noofseats;
			this.type=type;
			this.color=color;
		}
			
		public void Details() {
			System.out.println("name: "+name);
			System.out.println("budget: "+budget);
			System.out.println("noofseats: "+noofseats);
			System.out.println("type: "+type);
			System.out.println("color: "+color);
			
		}
		public static void main(String[] args) {
			CarDetails demo=new CarDetails("benz",600000,5,"automatic","black");
			demo.Details();
			System.out.println();
			CarDetails demo1=new CarDetails("ferari",1000000,2,"automatic","red");
			demo.Details();
			
			
		
		
			

	}

}
