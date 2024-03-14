package JDK7Trywithresource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewithresource {
	public static void main(String[] args) throws IOException {

	File file =new File("sahasra.txt");
	try(FileWriter fw=new FileWriter(file)){
		String msg="sahasra writing the code";
		 char[] s=msg.toCharArray();
		fw.write(s);
		System.out.println("success");	
		System.out.println(msg);
	}
	catch(IOException e) {
	}
	}
	

	
		
	}	

