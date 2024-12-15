package com.demo.naninani;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {
		
		 String input = "This is a test String";

	        // Split the string into words
			/*
			 * String[] words = input.split(" ");
			 * 
			 * // Loop through the words and modify them based on their position for (int i
			 * = 0; i < words.length; i++) { if ((i + 1) % 2 != 0) { // Odd-positioned words
			 * (1st, 3rd, etc.) words[i] = words[i].toUpperCase(); } else { //
			 * Even-positioned words (2nd, 4th, etc.) words[i] = new
			 * StringBuilder(words[i]).reverse().toString(); } }
			 * 
			 * // Join the modified words back into a single string String result =
			 * String.join(" ", words);
			 * 
			 * // Output the result System.out.println(result);
			 */
		 
		//String output= Arrays.stream(input.split(" ")).map((w,i) -> (i%2==0) ? w.toUpperCase() : new StringBuilder(w).reve)
	}

}
