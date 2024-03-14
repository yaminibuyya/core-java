 package fileBased;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBuffer {
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\sahasra yamini\\Desktop\\spring-projects\\ExceptionHandling\\welcome.txt");
		BufferedReader br=new BufferedReader(file);
		
		int i;
		while((i=br.read())!=-1){//read only converts to bytes
		System.out.print((char)i);//now converts bytes to char
		
		
	}

}
}