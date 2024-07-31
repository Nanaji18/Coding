package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(22);
		s.add(12);

		s.add(1);

		s.add(5);

		s.add(12);
		s.add(null);
		s.add(12);

		s.add(null);

		System.out.println(s);
		
		System.out.println(".............");
		
		Set<Integer> lhs=new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(12);
		lhs.add(1);
		lhs.add(34);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		System.out.println(";;;;;;;;;;");
		Set<Integer> ts=new TreeSet<>();
		ts.add(23);
		ts.add(1);
		ts.add(2);
		ts.add(1);
	
		//ts.add(null);
		//ts.add(null);
		System.out.println(ts);
		
		//ListIterator<String> itr=ts.spliterator();
		


	}

}
