package com.create.iq;

public class Car extends vehicle{

	
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
		Car car=new Car();
		car.Start();
		car.engine();
		car.stop();
	 }
	 
	 }



