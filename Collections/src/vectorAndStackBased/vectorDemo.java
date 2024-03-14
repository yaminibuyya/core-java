package vectorAndStackBased;

import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo {
	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>();
		v1.addElement("yamini");
		v1.addElement(20);
		v1.addElement(-1);
		v1.addElement(new section("VI",300,4000.00));
		
		Vector<String> capitals=new Vector<String>();
		capitals.addElement("hyderabad");
		capitals.addElement("chennai");
		capitals.addElement("mumbai");
		
		//adding 2 lists
		Vector<Object> traverse=new Vector<Object>(v1);
		traverse.addAll(capitals);
		System.out.println(traverse);
		System.out.println("***********************");
		
		
		Enumeration<Object> enu=traverse.elements();
		while(enu.hasMoreElements()) {
//			Object i = enu.nextElement();
//			System.out.println(i);
			
			System.out.println(enu.nextElement());
		}
		
	}

}
