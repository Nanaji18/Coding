package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DemoArr {
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,5,8};
		
		List<Integer> num=Arrays.asList(arr);
		
		Optional<Integer> max=num.stream().min(Comparator.naturalOrder());
		if (max.isPresent()) {
			Integer bn=max.get();
			System.out.println(bn);
		}
	}

}
