package IllegalArgumentTHROWbased;

public class voterAGE {

	public static void main(String[] args) {
		int voterAge = 89;
		if(voterAge<18) {
			throw new IllegalArgumentException("under AGE");
		}
		else {
			System.out.println("voter id eligible candidate");
		}
		

	}

}
