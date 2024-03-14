package com.create.iq;

public class Car1 extends vehicle1 {
	 public Car1(String name, String color) {
			super(name, color);
		}
		@Override
		public void Start() {
			super.Start();
			System.out.println("car is starting");
		}
		 @Override
		public void engine() {
			super.engine();
			System.out.println("car engine is working good");
		}
		 @Override
		public void stop() {
			super.stop();
			System.out.println("car is gonna stop now");
		}
		 
		 public static void main(String[]args) {
			Car1 tata=new Car1("tata", "black");
			tata.Start();
			tata.engine();
			tata.stop();
			
			Car1 mg=new Car1("mg", "wh");
			 mg.Start();
			 mg.engine();
			 mg.stop();
		 }
		 
		 }





