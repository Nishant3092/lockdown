package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stack {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("Nishant");
		list.add("Raj");
		list.add("Java");
		list.add("Developer");
		list.add("Since 2015");

		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next()+"");
		System.out.println();
	}

}
