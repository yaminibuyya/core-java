package InherintanceBasedSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		cat ct=new cat("white", false, 4,"yes it already ate" );
		FileOutputStream fos=new FileOutputStream("animal.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(ct);
        oos.close();
        
        
        FileInputStream fis=new FileInputStream("animal.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
            cat mery = (cat)ois.readObject();
            ois.close();
            System.out.println(ct.toString());
        
	}

}
