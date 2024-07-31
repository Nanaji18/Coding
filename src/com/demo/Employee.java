package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	public static void main(String[] args) {
		

	
	
	List<Integer> list=Arrays.asList(41,64,67,1,2,3,41,2,3,4,4,5,6);
	
	List<Integer> list1=list.stream().distinct().collect(Collectors.toList());
	
	System.out.println(list1);
	
	//[41,6,5,4,3,2,1]

	
	//int num=list1.stream().sorted((o1, o2) -> o2-o1).skip(2).min((o1, o2) -> o2-o1).get();
			
			//min((o1, o2) -> o1-o2).get();
	
	int num=list1.stream().max((o1, o2) -> o1-o2).get();

	
	System.out.println(num);
	}
}
