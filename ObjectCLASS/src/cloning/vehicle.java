 package cloning;

public class vehicle implements Cloneable{
	private String Vehiclename;
	private String vehicleid;
	private double price;
	public vehicle(String Vehiclename,String vehicleid,double price) {
		this.Vehiclename=Vehiclename;
		this.vehicleid=vehicleid;
		this.price=price;
		 
	}
	@Override
	public String toString() {
		return "vehicle [Vehiclename=" + Vehiclename + ", vehicleid=" + vehicleid + ", price=" + price
				+ ", getVehiclename()=" + getVehiclename() + ", getVehicleid()=" + getVehicleid() + ", getPrice()="
				+ getPrice() + "]";
	}
	public String getVehiclename() {
		return Vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		Vehiclename = vehiclename;
	}
	public String getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		vehicle v=new vehicle("ferrari","Ts76798A",6800000.00);
		System.out.println("vehicle info: "+v);
		vehicle cloneing=(vehicle)(v.clone());
		System.out.println("cloned data: "+cloneing);
	}
	

}
