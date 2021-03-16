package com.java.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collectionslearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Object[] array = {"Ashok", 1233, 45.0, 'c'};
       List<Integer> obj = new ArrayList<Integer>();
       obj.add(90);
       obj.add(55);
       obj.add(67);
       obj.add(68);
       obj.add(69);
       obj.add(5, 5);
     
       // obj.add obj.size obj.get() 
       System.out.println(obj.get(5));
       System.out.println("**************************************");
       System.out.println(obj.get(1));
       System.out.println("**************************************");
       for (Integer list : obj) {
    	   System.out.println(list + " I am from for each loop - good luck");
		
	}
       Set<Integer> setobj = new LinkedHashSet<Integer>();
       setobj.add(95);
       setobj.add(99);
       setobj.add(99);
       for (int eachnumber : setobj) {
		System.out.println(eachnumber);
	}
       List<Integer> objlist = new ArrayList<Integer>(setobj);
       System.out.println(objlist.get(0));
       
   	Map<String, Integer> objmap = new HashMap<String, Integer>();
	
   	objmap.put("laptop", 50000);
   	objmap.put("keyboard", 10000);
   	System.out.println(objmap);
   	System.out.println(objmap.entrySet());
   	for (Entry<String, Integer> newmapobj : objmap.entrySet()) {
   		System.out.println(newmapobj	);
   	}
   	
       
	}


}
