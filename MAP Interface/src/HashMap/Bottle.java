package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class Bottle {
	private String color;
	private double price;
	
	public Bottle() {
		// TODO Auto-generated constructor stub
	}

	public Bottle(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bottle [color=" + color + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bottle other = (Bottle) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	

}
