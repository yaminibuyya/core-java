package com.gsonnnnn;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class app {
	public static void main(String[] args) throws IOException {
        String [] hobbies= {"tennis","volleyball","music"};
        person p1=new person("sahasra",25,hobbies);
        System.out.println(p1);
         
        Gson gson=new Gson();
        FileWriter writer=new FileWriter("person.json");
        gson.toJson(p1,writer);
        writer.close();
        String jsondata = gson.toJson(p1);
        System.out.println(jsondata);

    }

}
