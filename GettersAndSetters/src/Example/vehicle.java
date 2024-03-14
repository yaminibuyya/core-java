package Example;

public class vehicle {
	private String name;
	private double price;
	private String color;
      
	public vehicle() {
	}
	
	public vehicle(String name,double price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
		
	}

	@Override
	public String toString() {
		return "vehicle [name=" + name + ", price=" + price + ", color=" + color + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getColor()=" + getColor() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
