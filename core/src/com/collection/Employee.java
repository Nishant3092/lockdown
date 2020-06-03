package com.collection;

public class Employee {

	int id;
	String name ;
	String address;
	
	public Employee(int i , String n,String a) {
	
		id = i;
		name = n;
		address = a;
	}
	 void display() {
		 System.out.println("Id :-"+id);
		 System.out.println("Name :-"+name);
		 System.out.println("Address :-"+address);
	 }
}
