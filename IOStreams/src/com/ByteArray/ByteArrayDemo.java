package com.ByteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ByteArrayBasedPrograms.Employee;

public class ByteArrayDemo {

		  public static void main(String[] args) throws IOException {
		        FileOutputStream hrfile=new FileOutputStream("hr.txt",true);
		        FileOutputStream mgfile=new FileOutputStream("mg.txt",true);
		        FileOutputStream tlfile=new FileOutputStream("tl.txt",true);
		        FileOutputStream employeesfiles=new  FileOutputStream("company.txt",true);
		        
		        ByteArrayOutputStream baos=null;
		        
		        
		        //hrfile
		        
		        Employee hr1=new Employee(1, "sanvi", 40000.00);
		        Employee hr2=new Employee(2, "Sakshi", 45000.00);
		        Employee hr3=new Employee(3, "Sam", 50000.00);
		        
		        Employee []hrs= {hr1,hr2,hr3};
		        for (Employee hrdata : hrs) {
		            
		        baos=new ByteArrayOutputStream();
		        baos.write(hrdata.toString().getBytes());
		        baos.writeTo(hrfile);
		        baos.writeTo(employeesfiles);
		        
		        System.out.println("success");
		            
		        }
		        baos.close();
		        
		        //mgfile
		 
		        Employee mg1=new Employee(4, "sunitha", 50000.00);
		        Employee mg2=new Employee(5, "Mahesh", 60000.00);
		        Employee mg3=new Employee(6, "Ramesh", 70000.00);
		        
		        Employee[]mgs= {mg1,mg2,mg3};
		        for (Employee mgdata : mgs) {
		            
		            baos=new ByteArrayOutputStream();
		            baos.write(mgdata.toString().getBytes());
		            baos.writeTo(mgfile);
		            baos.writeTo(employeesfiles);

		            
		            System.out.println("success");
		        }
		        
		        baos.close();
		        
		        // tlfile
		        
		        Employee tl1=new Employee(7, "Mounika", 80000.00);
		        Employee tl2=new Employee(8, "karthik", 90000.00);
		        Employee tl3=new Employee(9, "Rajesh", 100000.00);
		        Employee tl4=new Employee(10, "vrk", 110000.00);
		        
		        
		        Employee[]tls= {tl1,tl2,tl3,tl4};
		        for (Employee tldata : tls) {
		            baos=new ByteArrayOutputStream();
		            baos.write(tldata.toString().getBytes());
		            baos.writeTo(tlfile);
		            baos.writeTo(employeesfiles);

		            System.out.println("success");
		            
		        }
		        baos.close();
		  }
		        
		  
	}


