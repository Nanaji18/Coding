package com.str;

import java.util.stream.IntStream;

public class DemoArr {
	
	public static void main(String[] args) {
		
		IntStream t=IntStream.rangeClosed(1, 100);
		
		int[] arr=t.limit(50).toArray();
		
		for (int j : arr) {
			System.out.println(j);
		}
	}

}
