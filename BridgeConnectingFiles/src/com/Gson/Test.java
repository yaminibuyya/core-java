package com.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) throws IOException {
		
	String [] hobbies= {"tennis","cricket","volleyball"};
	
	Person p1=new Person("rithvik", 42, hobbies);
	Person p2=new Person("mani", 60, hobbies);
	Person p3=new Person("sireesh",76, hobbies);
	List<Person> pss= new ArrayList<Person>();
	pss.add(p1);
	pss.add(p2);
	pss.add(p3);
	for (Person person : pss) {
		System.out.println(person);
		
	}
//	System.out.println(p1);
//	System.out.println(p2);
//	System.out.println(p3);
	//we are creating Gson object to import gson and filewriter to store object in it
	Gson gson=new Gson();
	FileWriter fw =new FileWriter("Person.json");
	//now we are converting everthing in gson
	gson.toJson(pss,fw);
	fw.close();
	
	String jsondata=gson.toJson(pss);
	System.out.println(jsondata);
	
	
	
	

}
}