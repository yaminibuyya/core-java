package com.create.iq;

import java.io.Serializable;

public class Mobile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int RAM;
	private  float inches;
	private double price;
	
	public Mobile(String name,int RAM,float inches,double price) {
		this.name=name;
		this.RAM=RAM;
		this.inches=inches;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int RAM) {
		this.RAM = RAM;
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		this.inches = inches;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", RAM=" + RAM + ", inches=" + inches + ", price=" + price + ", getName()="
				+ getName() + ", getRAM()=" + getRAM() + ", getInches()=" + getInches() + ", getPrice()=" + getPrice()
				+ "]";
	}
	

}
