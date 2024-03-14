package JDK7Trywithresource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWithResource2Example {
  public static void main(String[] args) throws IOException {
	  File file=new File("creative.txt");
	  try(FileWriter fw=new FileWriter(file)){
		  String message="we should be creative";
		  fw.write(message.toCharArray());
		  System.out.println("done");
		  System.out.println(message);
		  
	  }
	
}
}	