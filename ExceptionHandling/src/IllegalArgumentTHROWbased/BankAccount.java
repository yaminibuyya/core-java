package IllegalArgumentTHROWbased;

public class BankAccount {
	private  int AccNo;
	private  String AccName;
	private double balance;
	
	public BankAccount(int AccNO,String AccName,double balance) {
		this.AccNo=AccNo;
		this.AccName=AccName;
		this.balance=balance;
		
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public  double deposit(double amount) {
		if(amount>500) {
			this.balance+=amount;
			System.out.println("Amount present in your account:"+balance);
		}
		else {
			throw new IllegalArgumentException("plz deposit minimum above 500rupees");
		}
		return balance;
			
		}
	public double withdrawl(double amount) {
		this.balance-=amount;
		if(amount>balance) {
			throw new IllegalArgumentException("In your account u dont have sufficent amount");
		}
		else {
			System.out.println("Amount withdrawn :"+amount);
			System.out.println("Remaining Balance in your Account  :" +balance);
		}
		return amount;
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(3456, "sahasra yamini", 60000.00);
		ba.deposit(905.00);
		ba.withdrawl(700);
	}
	
	

}
