package fileBased;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FilewriterProgram {

	public static void main(String[] args) {
		File file=new File("writeexample.txt");
		String msg="welcome to file writingexample";
		FileWriter writer=null;
		try {
			 writer=new FileWriter(file);
			char[] chars=msg.toCharArray();
			writer.write(chars);
			System.out.println("success");
		}
		catch(IOException io) {			
			io.printStackTrace();
		}
	finally {
			try {
				writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
		}
		}
		

	}

}
