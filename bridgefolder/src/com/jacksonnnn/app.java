package com.jacksonnnn;

import java.io.File;
import java.io.IOException;

import com.createiq.person;
import com.fasterxml.jackson.databind.ObjectMapper;

public class app {
	public static void main(String[] args) throws IOException {
        String hobbies[]= {"cooking","reading","playing"};
        person sahu=new person("sahasra", 25, hobbies);
        
        
        
        //object to json
        
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sahu);
        System.out.println(json);
        mapper.writeValue(new File("pr333333.json"),sahu);
        
        //reading convert json to oop
        
        person p=mapper.readValue(new File("pr.json"), person.class);
        System.out.println(p);
    
    }


}
