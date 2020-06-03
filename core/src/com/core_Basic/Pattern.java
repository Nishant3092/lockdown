package com.core_Basic;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		//  int i, j, k =0;
		  
	       /* for (i = 1; i <= 5; i++) {
	            for (j = 1; j < i + 1; j++) {
	                System.out.print(k++ + " ");
	            }
	 
	            System.out.println();
	        }
		  */
		 for(int i=1; i<=5; i++){
			  for(int j=5; j>=i; j--){
				  System.out.print("*");
				  }
			  
			  System.out.println();
		  }
	}
}
