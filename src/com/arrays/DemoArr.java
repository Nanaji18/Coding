package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoArr {
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,5,8};
		
		List<Integer> num=Arrays.asList(arr);
		
		int max=num.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println(max);
	}

}
