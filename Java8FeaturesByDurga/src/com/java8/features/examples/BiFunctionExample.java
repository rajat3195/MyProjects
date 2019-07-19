package com.java8.features.examples;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee2 {
	int eno;
	String name;

	Employee2(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
}

public class BiFunctionExample {
	public static void main(String[] args) {
		ArrayList<Employee2> l = new ArrayList<>();
		BiFunction<Integer, String, Employee2> f = (eno, name) -> new Employee2(eno, name);
		l.add(f.apply(100, "Durga"));
		l.add(f.apply(200, "Rajat"));
		l.add(f.apply(300, "Ravi"));
		l.add(f.apply(400, "Shiva"));
		for (Employee2 e : l) {
			System.out.println("Employee Number : " + e.eno);
			System.out.println("Employee Name : " + e.name);
			System.out.println();
		}
	}
}
