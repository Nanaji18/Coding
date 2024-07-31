package com.collections;

public class Demo {
	
	public static void main(String[] args) {
		
		int x=10;  
		/*
		 * System.out.println(x++);//10 (11) System.out.println(++x);//12
		 * System.out.println(x--);//12 (11) System.out.println(--x);//10
		 */
		int y=x++ + ++x;
		System.out.println(y);
		
		int t=8;
		System.out.println(~t);
		int u=-7;
		System.out.println(~u);
	}
	

}
