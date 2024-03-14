package com.composition;

public class Person {
	private String name;
	private  String lastname;
	private int phonenumber;
	private String emailId;
	private Job job;
	
	public Person(String name,String lastname,int phonenumber,String emailId,Job job) {
		this.name=name;
		this.lastname=lastname;
		this.phonenumber=phonenumber;
		this.emailId=emailId;
		this.job=job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber=phonenumber;	
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	
	
	

}
