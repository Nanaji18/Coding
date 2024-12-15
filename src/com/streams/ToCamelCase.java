package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToCamelCase {

	public static String toCamelCase(String str) {

		String[] arr = str.toLowerCase().split(" ");

		return Arrays.stream(arr).filter(n -> !n.isEmpty())
				.map(n -> Character.toUpperCase(n.charAt(0)) + n.substring(1)).collect(Collectors.joining(" "));
		
		//return str.charAt(0).to
	}

	public static void main(String[] args) {

		List<String> names = Arrays.asList("nAni", "sAI", "aBHI", "nagA","Nani");

		System.out.println(toCamelCase("naNI"));

		Map<String, Long> map = names.stream().map(ToCamelCase::toCamelCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.forEach((x, y) -> System.out.println(x + " : " + y));

	}

}
