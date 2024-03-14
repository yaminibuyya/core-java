package com.createiq;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class test {
	public static void main(String[] args) {
		Employee emp=new Employee(1, "afreen", 12345);
        Gson g=new Gson();
        //converts object to json like {"": ,"": ,} key value pairs
        String str=g.toJson(emp);
        System.out.println(str+"\n");
        
        
        //list of employees
        
        Employee emp1=new Employee(2, "fathima", 1203456);
        Employee emp2=new Employee(3, "arhan", 12345286);
        Employee emp3=new Employee(4, "akhthar", 1234568);
        
        List li=new ArrayList<>();
        li.add(emp1);
        li.add(emp2);
        li.add(emp3);
        //it represent as array like[{emp1},{emp2},{emp3}]
        String list=g.toJson(li);
        System.out.println(list);
        
    }
    


	

}
