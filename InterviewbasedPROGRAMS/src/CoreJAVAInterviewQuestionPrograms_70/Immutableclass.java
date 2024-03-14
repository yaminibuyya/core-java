package CoreJAVAInterviewQuestionPrograms_70;

public final class Immutableclass implements Cloneable {
	
	private final String Pannumber;
  


	public Immutableclass(String pannumber) {
	this.Pannumber = pannumber;
	}



	public String getPannumber() {
		return Pannumber;
	}
	//to display o/p in display method format
//	public void display() {
//		System.out.println("PAN : "+Pannumber);
//	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Immutableclass ic=new Immutableclass("SAH246");
		String s1=ic.getPannumber();
		System.out.println("pannumber: "+s1);
		//ic.display();
		
		
		//iam cloned an immutable object
		Object d = ic.clone();
		String s2=ic.getPannumber();
		System.out.println("PANNumber"+s2);
		
	}

//to display in to string format
//	@Override
//	public String toString() {
//		return "Immutableclass [Pannumber=" + Pannumber + "]";
//	}



}