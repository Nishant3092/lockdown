package com.core_Basic;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str="NITIN" ;
		
		char[] strCharArray=str.toCharArray();
		
		int length=0;
		
	/*	System.out.println(strCharArray);*/
	for(char c:strCharArray)
  {
   length++;
  }
	
		System.out.println(length);
		
		
		for(int j=length-1;j>=0;j--){
		    
		    System.out.print(strCharArray[j]);
		}
		
	}

}
