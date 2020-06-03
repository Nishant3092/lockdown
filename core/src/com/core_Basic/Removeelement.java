package com.core_Basic;

import java.util.HashMap;
import java.util.Iterator;

public class Removeelement {
    
    public static void main(String[] args)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("Java", 1);
        hashmap.put("Hungry" , 2);
        hashmap.put("Blogspot" , 3);
        hashmap.remove("Blogspot");
 
        Iterator iteratorobject = hashmap.keySet().iterator(); 
        while(iteratorobject.hasNext()){
              Object hashmapkey = iteratorobject.next(); 
              System.out.print(hashmap.get(hashmapkey));
        } 
    }
}
