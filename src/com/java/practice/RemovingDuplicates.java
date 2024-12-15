package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingDuplicates {
	
	public static void main(String[] args) {
		
		/*
		 * List<Integer> list=Arrays.asList(1,1,1,2,3,4,2,34,3,1,2,4);
		 * 
		 * Set<Integer> set=new HashSet<Integer>();
		 * 
		 * Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		 * 
		 * for (Integer integer : list) { if (!set.add(integer)) { map.put(integer,
		 * map.getOrDefault(integer, 0)+1); } }
		 * 
		 * System.out.println(map);
		 */
		
		 List<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
	        List<String> list2 = new ArrayList<>(Arrays.asList("banana", "date", "grape", "kiwi", "apple"));

	        // Create a new list to hold common elements
	        List<String> commonElements = new ArrayList<>(list1);

	        // Retain only the elements that are also in list2
	        commonElements.retainAll(list2);

	        // Output the common elements
	        System.out.println("Common elements: " + commonElements);
	}

}
