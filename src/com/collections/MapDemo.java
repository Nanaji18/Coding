package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> hm=new TreeMap<>();
		//Map<Integer,String> hm=new Hashtable<>();
		hm.put(5, "Nani");
		hm.put(2, "Nani");
		hm.put(2, "Nani");
		hm.put(1, "kani");
		 hm.put(null, "Suku");
		hm.put(7, null);
		//hm.put(null, "fani");
		//hm.put(null, "Jani");

		
		System.out.println(hm);
		
		
		
		
		
		
		
		

		
	}

}
