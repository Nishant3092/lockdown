package com.collection;

import java.util.ArrayList;

public class ArrayListLoopExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		/*ArrayList<String> al = new ArrayList<>();*/
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println("Using Advanced Loop");
		for(Integer num:al) {

			System.out.println(num);
		}

	}

}
