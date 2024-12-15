package com.demo.naninani;

public class Demo3 {
	
	public static void main(String[] args) {
		
		String str="java is super keka easy and awesome";
		
		String[] arr=str.split(" ");
		
		for (int i = 0; i < arr.length; i=i+3) {
			System.out.println(arr[i]);
		}
		
		
	}

}
