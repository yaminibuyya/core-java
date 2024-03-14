package demo;

public class StudentINGeneric <T>{
	T t;
	public void m1(T t) {
		//this.t=t;
		System.out.println(t); 
	}
	public void m2(T t,T u) {
		//this.t=t;
		System.out.println(t);
		System.out.println(u );
		
		
	}
	
	public static void main(String[] args) {
		StudentINGeneric<String> s1=new StudentINGeneric<>();
		s1.m1("sahasra");
		s1.m1("yamini");
		StudentINGeneric<Integer> s2=new StudentINGeneric<>();
		s2.m2(678,7985);
		
	}

}
