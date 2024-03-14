package StringbasedPrograms;

public class compareTwoObjects {
	public static void main(String[] args) {
	String s1="Eah";
	String s2= new String("Eah");
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1==s2);
	
	
	}
}
