package com.create.iq;

public class vehicle1 {
	private String name;
	private String color;

	public  vehicle1(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
	public void Start() {
		System.out.println("vehicle is running  " + name +" "+color );
	}
	public void engine() {
		System.out.println("1500 cc engine");
	}
	public void stop() {
		System.out.println("vehicle is stopped");
	}


	}





