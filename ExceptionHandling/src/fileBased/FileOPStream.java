package fileBased;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOPStream {

	public static void main(String[] args) throws IOException {
		String message="file writing based problem";
		File file=new File("welcome.txt");
		try {
			FileOutputStream fs1=new FileOutputStream(file);
			byte[] bytes=message.getBytes();
			fs1.write(bytes);
			System.out.println("success");	
		}
		catch(FileNotFoundException fe ) {
			System.out.println(fe.getMessage());	
		}
		catch(IOException io) {
			System.out.println(io.getMessage());
		}
		
		
	}

}
