package com.create.iq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test {
public static void main(String[] args) {
	 try {
		FileInputStream fis=new FileInputStream("mobile.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=(Object)ois.readObject();
		System.out.println(o);
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	 
}
}
