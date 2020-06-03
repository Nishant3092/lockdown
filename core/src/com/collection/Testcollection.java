package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Testcollection {

	public static <T> void main(String[] args) {
	 ArrayList<String> al = new ArrayList<>();
	 
	 al.add("Nishant");
	 al.add("Java");
	 al.add("collection Class");
	 al.add("December");
	 al.add("2019");
	 al.add("Sunday-15");
	 
	 // Collections.reverseOrder();
	 
	 Collections.sort(al);
	
	 
	 System.out.println(al);
	 

	}

}
