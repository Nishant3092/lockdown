package com.core_Basic;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		
		String[] Narray = {"Array","Hello","Morning","Bhole","Nishant","Bhole","Hello"};

		HashSet<String> set = new HashSet<>();
		
		for(String duplicateElement:Narray){
			if(!set.add(duplicateElement)){
				System.out.println("Duplicate Word :"+duplicateElement);
			}
		}
	}

}
