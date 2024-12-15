package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateProgram {

	public static void main(String[] args) {

		String[] input = { "baby", "ball", "baby", "soap", "shampoo", "chalk", "baby", "soap", "makeup", "baby",
				"lotion" };

		Map<String, Integer> elementCountMap = new HashMap<>();
		for (String element : input) {
			elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
		}
		
		System.out.println(elementCountMap);
		
		for (Map.Entry<String, Integer> entry : elementCountMap.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" repeated "+entry.getValue()+" times");
			}
		}
	}

}
