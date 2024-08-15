package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StuMain {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<>();

		s.add(new Student(1, "Nani", 89));
		s.add(new Student(2, "Mani", 99));
		s.add(new Student(3, "Nani", 49));
		s.add(new Student(4, "Hani", 59));
		s.add(new Student(5, "Rani", 69));

		Collections.sort(s);
		s.forEach(System.out::println);
	}

}
