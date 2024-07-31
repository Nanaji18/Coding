package com.str;

public class StrDemo {
	
	public static void main(String[] args) {
		
		String s1="nani";
		String s2="nani";
		
		System.out.println(s1==s2);
		
		s1=s1+"morukurthi";
		
		System.out.println(s1==s2);
		
		String s3="nanimorukurthi";
		
		System.out.println(s1==s3);
		
		StringBuffer sb=new StringBuffer("Naga");
		sb.insert(0, "n");
		sb.append("Lakshmi");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Nani");
		System.out.println(sb1.indexOf("N"));
		sb1.append("Lakshmi");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		System.out.println(">>>>>>>>>>");
		
		String s5=new String("Hello");
		String s6=new String("Hello");
		System.out.println(s5==s6);



	}

}
