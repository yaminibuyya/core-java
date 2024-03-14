 package com.BufferWriterrrrrr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Sequencebased.laptop;

public class BufferWriterDemo {
	public static void main (String[] args) throws IOException {
	FileWriter filewriter=new FileWriter("buffwriter.txt") ;
    BufferedWriter bw=new BufferedWriter(filewriter);
    
     laptop l1=new laptop("dell",8,55000.00);
     laptop l2=new laptop("apple",5,90000.00);
     laptop l3=new laptop("asus",6,75000.00);
     
     laptop[] lps= {l1,l2,l3};
     for(laptop   lapdata:lps) {
    	 bw.write(lapdata.toString().toCharArray());
    	 bw.newLine();
     }
     bw.close();
     
     
     FileReader fis=new FileReader("buffwriter.txt");
     BufferedReader br=new BufferedReader(fis);
     int i=0;
     while((i=br.read())!=-1){
    	 System.out.print((char)i);
     }
    	 
     }

}
