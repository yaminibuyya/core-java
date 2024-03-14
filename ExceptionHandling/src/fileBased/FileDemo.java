package fileBased;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String message="i love java programming";
		System.out.println(message);
		
		File file=new File("msg.txt");//creating an empty file
		FileOutputStream fs1=new FileOutputStream(file);//we will write msg in empty file
		byte[] bytes=message.getBytes();
		fs1.write(bytes);
		System.out.println("success");
		fs1.close();
		
	}

}
