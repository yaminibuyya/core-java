package normaLInnerClass;

public class yer {

	public static void main(String[] args) {
		String s="1";
		String s1=new String("2");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);

		s1=s1.intern();
		System.out.println(s==s1);
	}

}
