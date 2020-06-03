package com.collection;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
    { 
        TreeSet<String> treeSet = new TreeSet<>(); 
  
        treeSet.add("Java"); 
        treeSet.add("J2EE");
        treeSet.add("J2EE");
        treeSet.add("Spring"); 
        treeSet.add("Hibernate");
        treeSet.add("SpringBoot/Microservices");
  
        for (String temp : treeSet) 
            System.out.printf(temp + " "); 
  
        System.out.println("\n"); 
    } 
}

/*A TreeSet sorts the data in ascending order that is inserted in it. Therefore, 
the output string contains all the strings arranged in ascending order.
A TreeSet does not contain any duplicate element as it is a set. 
So in the output, there is just a single occurance of string ‘Geeks’.*/