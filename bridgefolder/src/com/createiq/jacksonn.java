package com.createiq;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class jacksonn {
	public static void main(String[] args) throws IOException {
        String hobbies[]= {"cooking","reading","playing"};
        person rohan=new person("rohan", 25, hobbies);
        //object to json
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rohan);
        System.out.println(json);
        mapper.writeValue(new File("pr.json"),rohan);
        
//        //reading convert json to oop
//        person p=mapper.readValue(new File("pr.json"), person.class);
//        System.out.println(p);
    
    }


}
