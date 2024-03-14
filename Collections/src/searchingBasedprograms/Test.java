package searchingBasedprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
		public static void main(String[] args) {

			Student s1=new Student(67, "yamini", 70000.00, 98765456);
			Student s2=new Student(68, "sai", 120000.00, 87665456);
			Student s3=new Student(1, "Pavani", 90000.00, 78765456);
			Student s4=new Student(70, "krishna", 140000.00, 48765456);

			ArrayList<Student> students = new ArrayList<Student>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add(s4);

			 Iterator<Student> itr=students.iterator();
			 while(itr.hasNext()) {
				 Student student=(Student) itr.next();
				 System.out.println(student);
				 
			 }

//			for(int i=0;i<students.size();i++) {
//				System.out.println(students.get(i));
//			}

//			Collections.sort(students, new Comparator<Student>() {
	//
//				@Override
//				public int compare(Student o1, Student o2) {
//					// TODO Auto-generated method stub
//					return o1.getName().compareTo(o2.getName());
//				}
//			});

//			for (Student student : students) {
//				System.out.println(student);
//			}
//			Iterator itr=students.iterator();
//			 while(itr.hasNext()) {
//				 Student student=(Student) itr.next();
//				 System.out.println(student);
//		}	 
			
			System.out.println("*******************");
			for (Student student : students) {
				if(student.getName().startsWith("P")){
				
			if(student.getId()<2)
			{
				
					System.out.println(student);
				}
			}
			 

		}

	}
}


