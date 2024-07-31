package com.loops;

import java.util.ArrayList;
import java.util.List;

public class DemoArr {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 2;
		arr[4] = 10;
		arr[1] = 4;
		arr[3] = 8;
		arr[2] = 6;
		List l=new ArrayList();
		for (int i : arr) {
			System.out.println(i);
			l.add(i);
		}
		
		l.add("nani");
		l.add(0, 89);
		
		System.out.println(l);

	}

}
