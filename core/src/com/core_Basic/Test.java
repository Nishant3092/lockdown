package com.core_Basic;

public class Test { 
    public static void main(String[] args) 
    { 
        String s1 = new String("HELLO"); 
        String s2 = new String("HELLO");
        
        // check Refrence
        System.out.println(s1 == s2); 
        // Check Value 
        System.out.println(s1.equals(s2)); 
    } 
} 
