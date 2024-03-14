package fileBased;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOPStreamNULL {

	public static void main(String[] args) throws IOException {
		File file=null;
		FileOutputStream fs1=null;
		try {
			String message="my love to my code";
			 file=new File("welcome.txt");
			 fs1=new FileOutputStream(file);
			 fs1.write(message.getBytes());
             System.out.println("success");			 	
		}
		catch(FileNotFoundException fe) {
		System.out.println(fe.getMessage());	
		}
		catch(IOException io) {
			System.out.println(io.getMessage());
		}
		finally {
			try
			{
				if(fs1!=null)
					System.out.println("clean up activity");
			     fs1.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	
		

	}

}
