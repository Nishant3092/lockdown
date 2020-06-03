package com.collection;

import java.util.LinkedList;
import java.util.List;

public class linkedList {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("Nishant");
		list.add("Raj");
		list.add("java");
		list.add("developer");
		list.add("Spring Boot /Microservice");
		
		List<String> list1 =  new LinkedList<>();
		list1.add("Hello Java Developer");
		
		list.removeAll(list1);
		
		for (String temp : list1) 
            System.out.printf(temp + " "); 
  
        System.out.println(); 
         
        

	}

}
