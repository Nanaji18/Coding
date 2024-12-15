package com.loops;

public class Print1To100Nums {

	public static void main(String[] args) {

		int i = 150;
		while (i <= 200) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----------------------------");

		for (int j = 150; j < 201; j++) {
			if (j % 7 == 0) {
				System.out.println(j);
			}
		}

		System.out.println("---------------------");

		for (int k = 199; k >= 25; k = k - 2) {
			System.out.println(k);
		}

	}

}
