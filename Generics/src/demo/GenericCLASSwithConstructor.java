package demo;

public class GenericCLASSwithConstructor <T>{
	T t;
	T ob1;
	T ob2;
	
	public GenericCLASSwithConstructor(T t){
		this.t=t;
	}
	public GenericCLASSwithConstructor(T ob1,T ob2){
	this.ob1=ob1;
	this.ob2=ob2;
	}
	
	public static void main(String[] args) {
		GenericCLASSwithConstructor gc=new GenericCLASSwithConstructor("Revenge"); 
		System.out.println(gc.t);
		GenericCLASSwithConstructor<Integer> gc1=new GenericCLASSwithConstructor<>(78, 89);
		System.out.println(gc1.ob1 +"  "+gc1.ob2);
	}

}
