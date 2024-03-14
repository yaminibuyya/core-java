package Treeset;

import java.util.TreeSet;

public class treesetdemo {
	public static void main(String[] args) {
		
	
	TreeSet treeSet= new TreeSet();
	
	treeSet.add("A");
	treeSet.add("a");
	treeSet.add("B");
	treeSet.add("Z");
	treeSet.add("L");
treeSet.add(null);// ClassCastException 
	// heterogeneous elements are not allowed in TreeSet and TreeMap
		//treeSet.add(10);  
	System.out.println(treeSet);



}}
