package demo;
//<>to specify parameter type
public class GenericCLASSwithMethod<T> {
	//T object is declared
	T t;
	public void m1(T t) {
		System.out.println("My name is : "+t);
	}
	public void m2(T u,T i) {
		System.out.println("id: "+u);
        System.out.println("salary: "+i);
	}
	
	//from<T> all datatypes will fall but from instance it only catch want we gave /which data type we gave
	
	public static void main(String[] args) {
		 GenericCLASSwithMethod<String> dg=new  GenericCLASSwithMethod();
		 dg.m1("sahasra");
		 GenericCLASSwithMethod dg1=new  GenericCLASSwithMethod();
		 dg1.m2(345,78000.00);
		 
	}

}
