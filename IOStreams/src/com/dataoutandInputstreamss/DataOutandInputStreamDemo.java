package com.dataoutandInputstreamss;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutandInputStreamDemo {

	public static void main(String[] args) throws IOException {
		DataOutputStream  dos=new DataOutputStream(new FileOutputStream("data.txt"));

		dos.writeByte(56);
		dos.writeBoolean(true);
		dos.writeDouble(20000.00);
		dos.writeInt(56789);
		dos.writeChar('s');
		dos.writeBytes("yamini");
		dos.writeFloat(78.0f);
		dos.writeLong(998765456L);
		dos.close();
		 
		DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));
		
		byte number=dis.readByte();
		System.out.println(number);
		
		boolean value=dis.readBoolean();
		System.out.println(value);
		
		double d=dis.readDouble();
		System.out.println(d);
		
		int i=dis.readInt();
		System.out.println(i);
		
		char c= dis.readChar();
		System.out.println(c);
		
		String mg=dis.readLine();
		System.out.println(mg);
		
		
//		
//		float f=dis.readFloat();
//		System.out.println(f);
//		
//		long l=dis.readLong();
//		System.out.println(l);
		
		dis.close();
		
	}

}
