package com.demo.naninani;

public class Demo4 {
	
	public static void main(String[] args) {
		
		String str="hello how are you mooooommmmmm";
		
		String[] arr=str.split(" ");
		
		String max=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			/*
			 * if (arr[i+1].length()>arr[i].length()) {
			 * 
			 * max=arr[i+1];
			 * 
			 * }
			 */
			if (arr[i].equals("how")) {
				System.out.println(arr[i]);
			}
			
		}
		
		//System.out.println(max);
		
	}

}
