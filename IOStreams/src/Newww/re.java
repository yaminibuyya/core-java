package Newww;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class re {
	private static FileOutputStream fos = null;

	public static void empOutputStream(Employee employee) {

		try {
			fos = new FileOutputStream("employee.txt");
			byte[] bytes = employee.toString().getBytes();
			fos.write(bytes);
			System.out.println("success...!");
		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Employee employee = new Employee(1000, "laxmi", 32000.00);
		empOutputStream(employee);
		

	}
}
