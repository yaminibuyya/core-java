package HowtocreateCustomObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student (5678,"sahasra", 70000.00, 98765433);
		//System.out.println(s1);
		Student s2=new Student(9877, "sravani", 80000.00,5678908);
		Student s3=new Student(98766, "vamsi", 980000.00,987654765);
		Student s4=new Student(87666,"anudeep",7800000.00,776543456);
//here with out giving syso it wont display the o/p to display the o/p we can use arraylist too
		ArrayList<Student> Students =new ArrayList<Student>();
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		Students.add(s4);
		System.out.println(Students);
		System.out.println("**************************");
		//using for each loop
		for(Student y1:Students) {
			System.out.println(y1);
		}
		System.out.println("*************************");
		//using iterator object
		Iterator<Student> itr=Students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			System.out.println("***********************");
			//using normal for loop
		for(int i=0;i<Students.size();i++) {
			System.out.println(Students.get(i));
		}
		}
		
		
		
	}



