package com.demo.patterns;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * String str="morukurthi appalaraju java developer hyderabad";
		 * 
		 * String[] arr=str.split(" ");
		 * 
		 * System.out.println(arr.length);
		 * 
		 * String rev="";
		 * 
		 * 
		 * for(int i=arr.length-1;i>=0;i--){
		 * 
		 * rev=rev+arr[i]+" ";
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 */
		
		Integer[] arr1={1,5,2,6,3,7,9,4};
		
		System.out.println(Arrays.asList(arr1).toString());
		Deque<Integer> l=new LinkedList<>();
		
		for (Integer integer : arr1) {
			
			if (integer%2==0) {
				l.addFirst(integer);
			}else {
				l.add(integer);
			}
			
			
			
		}


		System.out.println(l);
		
		l.add(1);
		
		System.out.println(l);
		
		
		List<String> ls=Arrays.asList("Nani","Mani","Ganiiih");
		
		ls.stream().map(n->n+":"+n.length()).forEach(System.out::println);
		
		Integer[] arrr1= {1,2,3,4};
		Integer[] arrr2= {4,5,6,7};
		
		
		
		
		
	}

}
