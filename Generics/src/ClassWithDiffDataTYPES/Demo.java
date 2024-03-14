package ClassWithDiffDataTYPES;

public class Demo <T,U>{
	T t;
	U u;
	//constructor with diff parameters &datatype
	public Demo(T t ,U u) {
		this.t=t;
		this.u=u;
	}
	//method with diff parameter & data type
	public void  m1(T obj1,U obj2) {
		System.out.println(obj1);
		System.out.println(obj2);	
	}
	  
	public static void main(String[] args) {
		Demo<String, Integer> d1=new Demo("sahasra", 98);
		System.out.println(d1.t+" "+d1.u);
		//diff paramerer & Datatype ...instance creation
		d1.m1("yamini", 989);
		
	}

}
