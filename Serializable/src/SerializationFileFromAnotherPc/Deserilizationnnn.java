package SerializationFileFromAnotherPc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilizationnnn {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\sahasra yamini\\Downloads\\utSchool.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		School s=(School)ois.readObject();
		System.out.println(s);
	}

}
