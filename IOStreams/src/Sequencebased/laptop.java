package Sequencebased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class laptop {
	private String name;
	private int inches;
	private double price;
	 
	public laptop(String name,int inches,double price) {
		this.name=name;
		this.inches=inches;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;	
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
	this.inches=inches;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "laptop [name=" + name + ", inches=" + inches + ", price=" + price + ", getName()=" + getName()
		+ ", getInches()=" + getInches() + ", getPrice()=" + getPrice() + "]";
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		laptop lp=new laptop("hp", 7, 60000.00);
		
		try(FileOutputStream fos=new FileOutputStream("sequence2.txt")){
			fos.write(lp.toString().getBytes());
			System.out.println("completed");
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		
		//inputStream
		try(FileInputStream fis=new FileInputStream("sequence2.txt")){
			int i=0;
			while((i=fis.read())!=-1);
			System.out.println((char) i);
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
