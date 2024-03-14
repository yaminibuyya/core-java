package com.BufferOutputAndInput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.createiq.Employee;

public class BufferOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee employee = new Employee(9, "mani", 3987000.00);

		try (FileOutputStream fos = new FileOutputStream("bufferoutput.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			bos.write(employee.toString().getBytes());
			System.out.println("success...!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 try(FileInputStream fis=new FileInputStream("bufferoutput.txt");
				 BufferedInputStream bis=new BufferedInputStream(fis)) {
					int i= 0;
					while((i=bis.read())!=-1) {
						System.out.print((char)i);
					}
				 }
	            catch(FileNotFoundException e) {
	            }
		        catch(IOException e) {
	            }
	
	}
	

}
