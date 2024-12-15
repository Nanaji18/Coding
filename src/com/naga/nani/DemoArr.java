package com.naga.nani;

import java.util.Arrays;

public class DemoArr {
	
	public static void main(String[] args) {
		
		int[] arr1=new int[5];
		arr1[0]=1;
		arr1[2]=0;
		
		System.out.println(arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		
		int[][] arr2=new int[2][3];
		
		arr2[0][0]=0;
		arr2[0][1]=1;
		arr2[0][2]=2;
		arr2[1][0]=3;
		arr2[1][1]=4;
		arr2[1][2]=5;
		
		for (int i = 0; i < arr2.length; i++) {
			int[] arr3=arr2[0];
			for (int j = 0; j < arr3.length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		String name="NANAJI";
		System.out.println(name.toCharArray());
		
		System.out.println(2+3+"Nanaji");
		System.out.println("Nanaji"+2+4);


		
	}

}
