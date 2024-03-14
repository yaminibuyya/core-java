package com.inheritance.parentWithoutSerialization;

public class vehicle {
	private String brand;
	private int version;
	
	public  vehicle() {
	}
	public vehicle(String brand,int version) {
		this.brand=brand;
		this.version=version;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "vehicle [brand=" + brand + ", version=" + version + ", getBrand()=" + getBrand() + ", getVersion()="
				+ getVersion() + "]";
	}
	
	
	}
	


