package Externalizationnnn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User u=new User(5,"sahasra");
		FileOutputStream fos=new FileOutputStream("user.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(u);
		oos.close();
		
		FileInputStream fis=new FileInputStream("user.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		User u1=(User)ois.readObject();
		System.out.println(u1.toString());
		ois.close();

		
	}

}
