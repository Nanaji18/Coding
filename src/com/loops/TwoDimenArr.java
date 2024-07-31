package com.loops;


public class TwoDimenArr {
	
	public static void main(String[] args) {
		
		int[][] arr= {{1,2},{3,4},{5,6}};
		
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 2; j++) {
		 * System.out.println(arr[i][j]); } }
		 */
		
		for (int[] i : arr) {
			for (int js : i) {
				System.out.println(js);
			}
		}
	}

}
