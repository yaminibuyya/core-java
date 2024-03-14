package com.inheritance.parentWithoutSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car c1=new Car("ford",8977,"madona","grey");
		FileOutputStream fos=new FileOutputStream("vehicletest.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
  
		
		FileInputStream fis=new FileInputStream("vehicletest.ser");
		ObjectInputStream ois=new ObjectInputStream (fis);
		Car cc=(Car)ois.readObject();
		System.out.println(cc.toString());
		ois.close();
		
	}

}

