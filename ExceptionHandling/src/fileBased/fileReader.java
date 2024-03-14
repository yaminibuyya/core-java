package fileBased;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\sahasra yamini\\Desktop\\spring-projects\\ExceptionHandling\\msg.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
	}

}
