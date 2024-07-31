package com.collections;

import java.util.stream.IntStream;

public class DemoArr {
	
	public static void main(String[] args) {
		
//		int[] num=IntStream.rangeClosed(1, 100).toArray();
//		for (int i : num) {
//			System.out.println(i);
//		}
		
		IntStream oddnum=IntStream.iterate(1, i->i+2);
		
		int[] oddASrr=oddnum.limit(50).toArray();
		
		for (int i : oddASrr) {
			System.out.println(i+1);
		}
	}

}
