package com.arrays;

public class Demomain {
	
	public static void main(String[] args) {
		Student[] stu=new Student[5];
		stu[0]=new Student(1, "Nani");
		stu[1]=new Student(2, "Mani");
		stu[2]=new Student(3, "Gani");
		stu[3]=new Student(4, "Hari");
		stu[4]=new Student(5, "Jani");
		
		int s=stu.length;
		
		System.out.println(s);
		
		System.out.println(stu[2]);
		
		for (Student student : stu) {
			System.out.println(student);
		}

	}

}
