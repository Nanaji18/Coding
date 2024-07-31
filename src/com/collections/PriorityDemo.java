package com.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> pq=new ArrayDeque<>();
		//Queue<Integer> pq=new PriorityQueue<>();

		pq.add(9);
		pq.add(52);
		pq.add(4);
		pq.add(7);
		pq.add(2);
		pq.add(10);
		pq.add(1);
		pq.add(2);
		pq.add(2);
		System.out.println(pq.peek());
		//pq.add(null);



		
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//
//		System.out.println(pq);

		
	}

}
