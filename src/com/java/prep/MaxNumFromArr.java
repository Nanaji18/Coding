package com.java.prep;

public class MaxNumFromArr {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		int max = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]>arr[i]) {
				max=arr[i+1];
			}
		}
		System.out.println(max);
	}

}
