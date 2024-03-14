package ClassWithDiffDataTYPES;

public class GenericMETHOD {
	
	public<E> void m1(E obj,E obj2) {
		System.out.println(obj);
		System.out.println(obj2);

}
	static<E> void m2(E obj1) {
	System.out.println(obj1);
	}
	public static void main(String[] args) {
		GenericMETHOD.m2(657);
		GenericMETHOD gm=new GenericMETHOD();
		gm.m1("practise well",89);
		//gm.m1(14.8765432);
	}
}