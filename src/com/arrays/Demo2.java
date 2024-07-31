package com.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo2 {
	
	public static void main(String[] args) {
		List<HashMap<Integer, Student>> sl=new ArrayList<>();
		
		HashMap<Integer, Student> hm=new HashMap<>();
		
		hm.put(1, new Student(1, "Nani"));
		hm.put(2, new Student(2, "Murthy"));
		hm.put(3, new Student(3, "Abhi"));
		hm.put(4, new Student(4, "Ramana"));
		
		sl.add(hm);
		
		System.out.println(sl);
		
//		Set<Integer> keys=hm.keySet();
//		for(Integer key:keys) {
//			System.out.println(key+key.);
//		}
		
		for (HashMap<Integer, Student> hh : sl) {
//			Set<Integer> keys=hh.keySet();
//			for(Integer key:keys) {
//				System.out.println(hh.get(key));
//			}
			
			Collection<Student> students=hh.values();
			for(Student stu:students) {
				System.out.println(stu);
			}
			
		}

	}

}
