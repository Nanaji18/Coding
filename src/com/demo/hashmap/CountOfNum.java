package com.demo.hashmap;

import java.util.HashMap;

public class CountOfNum {

	public static void main(String[] args) {

		Integer[] arr = { 1, 1, 1, 1, 2, 3, 2, 4, 4, 5, 3, 6, 5, 7, 3 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (Integer integer : arr) {
			if (hm.containsKey(integer)) {

				hm.put(integer, hm.get(integer) + 1);

			} else {
				hm.put(integer, 1);
			}
		}

		hm.forEach((k, v) -> System.out.println(k + " repeated:" + v));
	}

}
