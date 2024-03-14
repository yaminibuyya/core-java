package HasAaggregationBasedSERialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Address ad=new Address("khammam","hyd","india", 507008);
		Student s1=new Student("yamz",30878765 , ad);
		
		
		FileOutputStream fos=new FileOutputStream("Student.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		
		FileInputStream fis=new FileInputStream("Student.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s=(Student)ois.readObject();
		System.out.println(s.toString());
		ois.close();
	}
}
