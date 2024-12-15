package com.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfNum {
	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
		
		Integer sum=	nums.stream().reduce((x,y)->x+y).get();
		
		System.out.println(sum);
	}

}
