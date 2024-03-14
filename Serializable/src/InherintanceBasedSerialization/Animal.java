package InherintanceBasedSerialization;

import java.io.Serializable;

public class Animal implements Serializable {
	private boolean vegetarian;
	private  String eats;
	private  int nooflegs;
	
	public Animal() {
	}
	
   public  Animal(boolean vegetarian,String eats,int nooflegs) {
	   this.vegetarian=vegetarian;
	   this.eats=eats;
	   this.nooflegs=nooflegs;
   }

public boolean isVegetarian() {
	return vegetarian;
}

public void setVegetarian(boolean vegetarian) {
	this.vegetarian = vegetarian;
}

public String getEats() {
	return eats;
}

public void setEats(String eats) {
	this.eats = eats;
}

public int getNooflegs() {
	return nooflegs;
}

public void setNooflegs(int nooflegs) {
	this.nooflegs = nooflegs;
}

@Override
public String toString() {
	return "Animal [vegetarian=" + vegetarian + ", eats=" + eats + ", nooflegs=" + nooflegs + ", isVegetarian()="
			+ isVegetarian() + ", getEats()=" + getEats() + ", getNooflegs()=" + getNooflegs() + "]";
}
   
}
