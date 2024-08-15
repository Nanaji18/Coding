package com.demo.pattern;

public class AbcPattern {
	
	public static void main(String[] args) {
		generatePattern(4);
	}
	
	public static void generatePattern(int n) {
		char ch='A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(ch+ " ");
					if (ch<'Z') {
						ch++;
					}else {
						ch='A';
					}
				}				
			}
			System.out.println();
		}
	}

}
