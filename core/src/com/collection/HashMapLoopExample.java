package com.collection;

import java.util.*;

public class HashMapLoopExample {
   public static void main(String args[]) {
       
/*Part --1*/
  /* // Creating a HashMap of String keys and String values
   HashMap<String, String> hashmap = new HashMap<String, String>();
   hashmap.put("Key1", "Value1");
   hashmap.put("Key2", "Value2");
   System.out.println("Iterating or looping map using foreach loop");
   // Iterating or looping using keySet() method
   for (String key : hashmap.keySet()) {
       System.out.println("key: " + key + " value: " + hashmap.get(key));
   }*/
	   
	   /*Part-2*/
	   // Creating a HashMap of String keys and String values
	    HashMap<String, String> hashmap = new HashMap<String, String>();
	    hashmap.put("Key1", "Value1");
	    hashmap.put("Key2", "Value2");
	    System.out.println("Iterating or looping map using keySet Iterator");
	    // Iterating or looping using keySet() method
	    Set<String> keySet = hashmap.keySet();
	    Iterator<String> keySetIterator = keySet.iterator();
	    while (keySetIterator.hasNext()) {
	        String key = keySetIterator.next();
	        System.out.println("key: " + key + " value: " + hashmap.get(key));
	    }   
	   
	   
 }
}