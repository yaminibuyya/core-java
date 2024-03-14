package normaLInnerClass;

public class Bankloan {
	public static String bankname="SBI BANK";
	private double principle=50000;
	private int rate=4;
	private int  time=5;
	public void Simpleinterest() {
		double interest=(principle*time*rate)/100;
		System.out.println("Interest for the amount:"+interest);
		System.out.println("check the person has eligibility for granting loan");
	}
	public void EligibilityDetails() {
		System.out.println("Age must be >25");
		System.out.println("CIBIL score >750");	
		}
		
	
    public class person{
    	private String name="yamini";
		private int age=26;
		private  int CIBILscore=760;
		
		}
	
	public static void main(String[] args) {
		System.out.println("Bankname:"+Bankloan.bankname);
		 Bankloan ref=new  Bankloan();
		 System.out.println("Here is the principle"+ref.principle);
		ref.Simpleinterest();
		ref.EligibilityDetails();
		Bankloan.person myin=ref.new person();
		System.out.println("Name of the person:");
		System.out.println(myin.name);
		System.out.println(myin.age);
		System.out.println(myin.CIBILscore);
		System.out.println("she got the eligibility");
	}
	
	}
		
	
	
	
		
	



