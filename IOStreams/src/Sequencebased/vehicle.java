package Sequencebased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class vehicle {
	private String name;
	private int number;
	private String color;
	
//	public vehicle() {
//		
//	}
	public vehicle(String name,int number,String color) {
		this.name=name;
		this.number=number;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "vehicle [name=" + name + ", number=" + number + ", color=" + color + ", getName()=" + getName()
		+ ", getNumber()=" + getNumber() + ",getcolor()=" +getColor()+ "]";
	}
	
//	public static void main(String[] args) {
//		vehicle ve=new vehicle("tata", 78999, "black");
//		System.out.println(ve);
//	}
//	
	
	public static void main (String[] args) throws FileNotFoundException, IOException {
		vehicle ve=new vehicle("tata", 78999, "black");
		
		try(FileOutputStream fos=new FileOutputStream("sequence.txt")) {
			fos.write(ve.toString().getBytes());
			System.out.println("success");
		}
		catch(FileNotFoundException fe) {
		System.out.println(fe.getMessage());
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		//file input
		
		try(FileInputStream fis=new FileInputStream("sequence.txt")){
			int i=0;
			while((i=fis.read())!=1);
			System.out.println((char)i);
		}
		
		
		
		
		
	}

	
	
	
	
}
