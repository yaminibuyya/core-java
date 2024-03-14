package com.createiq;

public class EmployeeWithOutDefaultConstructor {

	String name;
	int budget;
	int noofseats;
	String type;
	String color;

	public EmployeeWithOutDefaultConstructor(String name, int budget, int noofseats, String type, String color) {
		this.name = name;
		this.budget = budget;
		this.noofseats = noofseats;
		this.type = type;
		this.color = color;
	}

	public void Details() {
		System.out.println("name: " + name);
		System.out.println("budget: " + budget);
		System.out.println("noofseats: " + noofseats);
		System.out.println("type: " + type);
		System.out.println("color: " + color);

	}

	public static void main(String[] args) {
		EmployeeWithOutDefaultConstructor demo = new EmployeeWithOutDefaultConstructor("benz", 600000, 5, "automatic", "black");
		demo.Details();
	}

}
