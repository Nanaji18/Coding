package com.demo.naninani;

public class DemoPalin {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Nanaji");
		StringBuilder rev1= sb.reverse();
		System.out.println(rev1);
		
		String str="RADARR";
		String rev="";
	for (int i = str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	if (str.equals(rev)) {
		System.out.println("It is a palindrome");
	}else {
		System.out.println("Not palindrome");
	}
	}

}
