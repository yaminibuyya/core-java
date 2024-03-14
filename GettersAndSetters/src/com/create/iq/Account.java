package com.create.iq;


public class Account {
	private String name;
	private long accountNo;
	private int chequeNo;
	private int rbiNo;
	private String bankName;

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public void setchequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public void setrbiNo(int rbiNo) {
		this.rbiNo = rbiNo;
	}

	public void setbankName(String bankName) {
		this.bankName = bankName;

	}

	public String getName() {
		return name;
	}

	public long getaccountNo() {
		return accountNo;
	}

	public int getchequeNo() {
		return chequeNo;
	}

	public int getrbiNo() {
		return rbiNo;
	}

	public String getbankName() {
		return bankName;
	}

	public static void main(String[] args) {
		Account account = new Account();

		
	System.out.println(account.getName());
		account.setAccountNo(14752792376l);
		account.setName("gayithri");
		System.out.println(account.getaccountNo());
		account.setchequeNo(950020);
		System.out.println(account.getchequeNo());
		account.setrbiNo(69500043);
		System.out.println(account.getrbiNo());
		account.setbankName("SBI");
		System.out.println(account.getbankName());
	}
}


