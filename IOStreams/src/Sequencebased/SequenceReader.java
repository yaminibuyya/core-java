package Sequencebased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceReader {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1=new FileInputStream("sequence.txt");
		FileInputStream fis2=new FileInputStream("sequence2.txt");
		

		SequenceInputStream sq=new SequenceInputStream(fis1,fis2);
		int i=0;
		while((i=sq.read())!=-1) {
			System.out.print((char)i);
		}
		
	}

}
