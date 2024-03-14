package com.composition.finalkeyword;

public class Laptop {
	
	private String company;
	private double cost;
	private String version;
	final AdvanceFeatures newFeatures;    
	
	public Laptop(String company, double cost, String version, AdvanceFeatures newFeatures) {
		
		this.company = company;
		this.cost = cost;
		this.version = version;
		this.newFeatures = newFeatures;
	}
	public AdvanceFeatures getNewFeatures() {
		return newFeatures;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", cost=" + cost + ", version=" + version + ", newFeatures=" + newFeatures
				+ "]";
	}
	
	

}