package com.loops;

public class RevStr {

	public static void main(String[] args) {
		String name = "Nanaji Morukurthi";
		String[] s1 = name.split(" ");

		String op = "";
		for (String s : s1) {
			for (int i = s.length() - 1; i >= 0; i--) {
				op = op + s.charAt(i);
			}
			op = op + " ";
		}

		System.out.println(op);

	}

}
