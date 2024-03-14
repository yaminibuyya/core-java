package Com.DAO;

public class Test {

	public static void main(String[] args) {
     student s1=new student(1, "Adinarayana", "adi@gmail.com",50000);
     student s2=new student(2,"yamini","yaminibuyya@gmail.com",60000);
     student s3=new student(3,"sravani","sravani@gmail.com",80000);
     student s4=new student(4,"anudeep","anudeep@gmail.com",40000);
     
     StudentDAOimpl testImpl =new StudentDAOimpl();
     
     testImpl.save(s1);
     testImpl.save(s2);
     testImpl.save(s3);
    testImpl.save(s4);
//     
//      System.out.println(testImpl.getByid(1));
//		System.out.println(testImpl.getByname("Adinarayana"));
//		
//		testImpl.update(s1);
	//	testImpl.delete(1);
  //   testImpl.create(null);//created a phone table
		
     
     testImpl.InsertList();
		
	}

}
