package com.create.iq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MobileFeatures {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Mobile me=new Mobile("real me", 8, 6.6f, 20000.00);
		FileOutputStream fos=new FileOutputStream("mobile.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(me);
		oos.close();
	
	FileInputStream fis =new FileInputStream("mobile.ser");
	ObjectInputStream ois= new ObjectInputStream(fis);
	Mobile me1=(Mobile)ois.readObject();
	System.out.println(me1.getInches());
	System.out.println(me1.getName());
	System.out.println(me1.getPrice());
	System.out.println(me1.getRAM());
	System.out.println(me1.toString());
	ois.close();

}
}