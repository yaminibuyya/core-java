package com.createiq;

import java.util.Arrays;

public class person {
	
	    private String name;
	    private int age;
	    private String[] hobbies;
	    
	    public person() {
	    }
	    
	    public person(String name,int age,String[] hobbies) {
	        this.name=name;
	        this.age=age;
	        this.hobbies=hobbies;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String Name) {
	        this.name=name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String[] getHobbies() {
	        return hobbies;
	    }

	    public void setHobbies(String[] hobbies) {
	        this.hobbies = hobbies;
	    }

	    @Override
	    public String toString() {
	        return "person [name=" + name + ", age=" + age + ", hobbies=" + Arrays.toString(hobbies) + ", getName()="
	                + getName() + ", getAge()=" + getAge() + ", getHobbies()=" + Arrays.toString(getHobbies()) + "]";
	    }
	    

}

