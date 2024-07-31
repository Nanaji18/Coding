package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainDemo {
	
	public static void main(String[] args) {
		
		//Student[] stu=Arrays.
				
				//List<Student> names=Arrays.asList(new Student(1, "nani"),new Student(2, "mani"));
		List<Student> names=IntStream.rangeClosed(1, 10).mapToObj(i->new Student(i, "Student"+i)).collect(Collectors.toList());
				System.out.println(names);
				
				for (Student student : names) {
					System.out.println(student.id);
					System.out.println(student.name);

				}

	}

}
