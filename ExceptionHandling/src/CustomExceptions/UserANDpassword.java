package CustomExceptions;

import IllegalArgumentTHROWbased.UserNameANDpassword;

public class UserANDpassword {
	String UserName;
	String password;
	
	
	UserANDpassword(){
		
	}

	public UserANDpassword(String UserName, String password) throws UserCredentialsAreWrong {
		this.UserName = UserName;
		this.password = password;
		if ((UserName == "sahasra") && (password == "mum@17654*")) {
			System.out.println("sucesssfully logined");
		} else {
			throw new UserCredentialsAreWrong("Not given correct credentials");
		}

	}

	public static void main(String[] args) {
		UserANDpassword up=new UserANDpassword("poojitha", "poojitha@123");
				
		
		

	}
}