package ByteArrayBasedPrograms;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.createiq.Employee;

public class ByteArrayDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream hr=new FileOutputStream("hr.txt");
		FileOutputStream manager=new FileOutputStream("mg.txt");
		FileOutputStream employeeData=new FileOutputStream("employee.txt");
		ByteArrayOutputStream bas=null;
		
		Employee hr1=new Employee(340,"nani", 78000.00);
		Employee hr2=new Employee(456,"mani",56000.00);
		Employee hr3=new Employee(555,"raj",90000.00);
		Employee[] hrs= {hr1,hr2,hr3};
		for (Employee hrsdata:hrs) {
			bas=new ByteArrayOutputStream();
			bas.write( hrsdata.toString().getBytes());
			bas.writeTo(hr);//we are writing file in hr reference where we are using
			bas.writeTo(employeeData);
		}
		Employee mg1=new Employee(678,"pooj",7800.00);
		Employee mg2=new Employee(898,"afreen",94677.00);
		Employee mg3=new Employee(234,"raji",9999.00);
		Employee[] mgrs= {mg1,mg2,mg3};
		for(Employee managerData:mgrs) {
			bas=new ByteArrayOutputStream();
			bas.write(managerData.toString().getBytes());
			bas.writeTo(manager);
			bas.writeTo(employeeData);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
