package com.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EmpList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int id;
		String name ;
		String address;
		
		
	ArrayList<Employee> al = new ArrayList<>();
	
	for(int i=0; i<5; i++) {
		
		System.out.println("Enter ID :");
		id = Integer.parseInt(br.readLine());
		
		System.out.println("Enter ID :");
		name = br.readLine();
		
		System.out.println("Eneter Address  :");
		address = br.readLine();
		
		Employee obj = new Employee(id, name, address);
		al.add(obj);
	}
	
	
	System.out.println("Eneter ID :");
	 id = Integer.parseInt(br.readLine());
	 
	 boolean found = false;
	 
	 for(int i=0; i<al.size(); i++) {
		
		 Employee obj = al.get(i);
		 
		 if(id == obj.id) {
			 obj.display();
			 found = true ;
		 }
	 }
	 if(!found)
	System.out.println("Empployee Not Found"); 
	}

}
