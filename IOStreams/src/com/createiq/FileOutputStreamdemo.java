package com.createiq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamdemo{

	private static FileOutputStream fos=null;
	public static void empOutputStream(Employee employee) {
		
		try {
			fos=new FileOutputStream("extra.txt");
			byte[] bytes=employee.toString().getBytes();
			fos.write(bytes);	
			System.out.println("success");
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
				if(fos !=null)
					try {
					fos.close();
			}catch(IOException io) {
				io.printStackTrace();
				
			}
		}
	}
	public static void empInputStream() throws IOException {
		FileInputStream fis = new FileInputStream("extra.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
	}

public static void main(String[] args) throws IOException {
	Employee employee=new Employee(4, "yamini", 65000);
	empOutputStream(employee);
	empInputStream();
}
}
      










