package com.demo.naninani;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2 {
	public static void main(String[] args) {
		// Given string
		String input = "Java is easy";

		// Remove spaces and convert to lowercase to make the search case-insensitive
		input = input.replace(" ", "").toLowerCase();

		// LinkedHashMap to maintain the order of characters
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();

		// Populate the map with character counts
		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(charCountMap);

		// Find the first repeated character
		Character firstRepeated = null;
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				firstRepeated = entry.getKey();
				break;
			}
		}

		// Find the first non-repeated character
		Character firstNonRepeated = null;
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				firstNonRepeated = entry.getKey();
				break;
			}
		}

		// Output the results
		if (firstRepeated != null) {
			System.out.println("First Repeated Character: " + firstRepeated);
		} else {
			System.out.println("No Repeated Characters Found.");
		}

		if (firstNonRepeated != null) {
			System.out.println("First Non-Repeated Character: " + firstNonRepeated);
		} else {
			System.out.println("No Non-Repeated Characters Found.");
		}
	}

}
