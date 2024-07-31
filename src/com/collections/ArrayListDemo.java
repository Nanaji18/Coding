package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Nani");
		names.add("Mani");
		names.add("Hani");
		names.add("Gani");
		System.out.println(names);
		System.out.println(names.size());
		names.add(2, "Naga");
		System.out.println(names);
		names.get(0);
		Boolean added = Collections.addAll(names, "lokesh", "raju");
		System.out.println("elements added :" + added);
		Collections.sort(names);
		System.out.println(names);
	}

}
