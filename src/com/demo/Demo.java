package com.demo;

public class Demo {
   public static void main(String[] args) {
	
	   String str="Hello World";
	   String rev="";
	   String[] s=str.split(" ");
	   System.out.println(s);
	   for(String b:s) {
		   System.out.println(b);
	   }
	   for(String a:s) {
		   for(int i=a.length()-1;i>=0;i--) {
			   rev=rev+a.charAt(i);
		   }
	   }
	   System.out.println(rev);
}
}
