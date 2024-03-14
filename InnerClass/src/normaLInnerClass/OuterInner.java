package normaLInnerClass;

public class OuterInner {
	private int id;
	private String name;
	private  static double salary =500000;
	
	public static void msg() {
		System.out.println("static method");
	}
	public void msg1() {
		System.out.println("non static method");
	}

	

	public  class Innerclass {
		private  int iid;
		public void msg3() {
			System.out.println("inner class method 1");
		}
		 
		public void msg2() {
			System.out.println("inner class method 2");
			System.out.println("outer id :"+id+"inner id :"+iid);
			
			msg1();
			msg();
		  
		}
		}
	public static void main(String[] args) {
		OuterInner outer =new OuterInner();
		outer.id=55;
		System.out.println(outer.name="poojitha");
		System.out.println(OuterInner.salary);
		OuterInner.Innerclass inner=outer.new Innerclass();
		inner.iid=56;
	
		inner.msg2();
		inner.msg3();
		
		
		
	}
}
