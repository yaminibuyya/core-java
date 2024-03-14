package HasAaggregationBasedSERialization;

import java.io.Serializable;

public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  String city,state,country;
	public int pincode;
	
	public Address(String city,String state,String country,int pincode) {
		this.city=city;
		this.state=state;
		this.country=country;
		this.pincode=pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	

}
