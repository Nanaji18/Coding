package com.demo.hashmap;

import java.util.stream.Stream;

public class UniqueChars {
	
	public static void main(String[] args) {
		
		String str="abcdABCDaBcDAbCd";
		
		Stream.of(str.split("")).distinct().forEach(n->System.out.println(n));
	}

}
