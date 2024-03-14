package CustomExceptions;

public class voterID {
	
	public void age(int age) throws applyAfterYouBecameMajor {
	
	if (age>=18) {
		System.out.println("Eligible to vote");
	}
	else {
		throw new applyAfterYouBecameMajor("u r under age");
	}
		
	}
	public static void main(String[] args)  {
		voterID v=new voterID();
		
		
		try {
			v.age(18);
		} catch (applyAfterYouBecameMajor e) {
			System.out.println(e);
		}
		
	}
	

}
