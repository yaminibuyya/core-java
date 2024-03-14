package com.create.iq;

public class Bike extends vehicle {
	
	  @Override
	public void Start() {
		super.Start();
		System.out.println("bike is gonna start");
	}
	  @Override
	public void engine() {
		super.engine();
		System.out.println("engine is working fine");
	}
	  @Override
	public void stop() {
		super.stop();
		System.out.println("bike is gonna stop");
	}
	  

	public static void main(String[] args) {
		Bike demo=new Bike();
		demo.Start();
		demo.engine();
		demo.stop();
	}

}
