package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main  {
	
	public static void main(String[] args) {
		
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(1, "Nani", 10000));
		l.add(new Employee(2, "Mani", 80000));
		l.add(new Employee(3, "Gani", 50000));
		l.add(new Employee(4, "Hari", 19000));
		l.add(new Employee(5, "Nahi", 90000));
		
		l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(m-> System.out.println(m));
//		
//		System.out.println(sasc);
		
	//Collections.sort(l,(e1,e2) -> e1.salary<e2.salary?1:-1);
			
		

	}

}
