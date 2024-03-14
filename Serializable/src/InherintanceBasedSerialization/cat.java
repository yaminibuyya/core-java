package InherintanceBasedSerialization;

public class cat extends Animal {
	private  String color;

	
	public cat(String color,boolean vegetarian,int nooflegs,String eats) {
		super(vegetarian,eats,nooflegs);
		this.color=color;
		
	}

	@Override
	public String toString() {
		return "cat [color=" + color + ", isVegetarian()=" + isVegetarian() + ", getEats()=" + getEats()
				+ ", getNooflegs()=" + getNooflegs() + "]";
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

}
