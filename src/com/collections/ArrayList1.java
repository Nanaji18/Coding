package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		List<Integer> firstFivePrimeNumbers=new ArrayList<>(Arrays.asList(2,3,5,7,9));
		System.out.println(firstFivePrimeNumbers);
		List<Integer> firstTenPrimeNumbers=new ArrayList<>(firstFivePrimeNumbers);
		firstTenPrimeNumbers.addAll(0, firstTenPrimeNumbers);
		System.out.println(firstTenPrimeNumbers);
		
	boolean	oddnum=firstFivePrimeNumbers.removeIf(n->n%2==0);
	System.out.println(firstFivePrimeNumbers);
	}

}
