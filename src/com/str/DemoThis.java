package com.str;

public class DemoThis {
	
	DemoThis get() {
		return this;
	}
	
	public static void main(String[] args) {
		System.out.println(new DemoThis().get());
	}

}
