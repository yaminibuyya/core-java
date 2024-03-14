package TryCatch;


public class STaticvoterAGE {

	static	int voterAge = 8;
		static {
		try {
			if(voterAge<18) {
				throw new IllegalArgumentException("under AGE");
			}
			else {
				System.out.println("voter id eligible candidate");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public static void main(String[] args) {
			STaticvoterAGE v=new STaticvoterAGE();
			System.out.println(voterAge);
			
	}

}
