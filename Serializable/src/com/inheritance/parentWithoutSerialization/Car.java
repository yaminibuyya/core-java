package com.inheritance.parentWithoutSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car extends vehicle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String color;
	public Car() {
	}
	public Car(String brand,int version,String name,String color) {
		super(brand,version);
		this.name=name;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ",getbrand()=" +getBrand()+ ",getVersion()= " +getVersion()+ "]";
	}
	private void writeObject(ObjectOutputStream oos) throws IOException {
	oos.defaultWriteObject();
	oos.writeObject(getBrand());
	oos.writeInt(getVersion());
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		setBrand((String)ois.readObject());
		setVersion(ois.readInt()); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
