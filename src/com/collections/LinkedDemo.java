package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {
	
	public static void main(String[] args) {
		
	
	
	List<String> ll=new LinkedList<>();
	
	ll.add("Nani");
	ll.add("Mani");
	ll.add("Hari");
	ll.add("Gani");
	ll.add("Bani");
	
	System.out.println(ll);
	
	ll.stream().filter(n->n.length()>3).map(s->s.length()).forEach(System.out::println);


}
}
