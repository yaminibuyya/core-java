package IllegalArgumentTHROWbased;

public class UserNameANDpassword {
	
		String UserName;
		String password;
		public  UserNameANDpassword(String UserName,String password) {
			this.UserName=UserName;
			this.password=password;
		if((UserName=="sahasra")&& (password=="mum@17654*")) {
			System.out.println("sucesssfully logined");
	}
		else {
			throw new IllegalArgumentException("Not correct credentials");
		}
		
		}

		public static void main(String[] args) {
			UserNameANDpassword usp=new UserNameANDpassword("sahasra", "mum@17654*");
		}
		}


