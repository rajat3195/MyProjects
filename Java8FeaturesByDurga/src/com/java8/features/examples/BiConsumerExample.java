package com.java8.features.examples;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee3 {
	String name;
	double salary;

	Employee3(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class BiConsumerExample {
	public static void main(String[] args) {
		ArrayList<Employee3> l = new ArrayList<>();
		populate(l);
		BiConsumer<Employee3, Double> c = (e, d) -> e.salary = e.salary + d;
		for (Employee3 e : l) {
			c.accept(e, 500.0);
		}

		for (Employee3 e : l) {
			System.out.println("Employee Name : " + e.name);
			System.out.println("Employee Salary : " + e.salary);
			System.out.println();
		}

	}

	private static void populate(ArrayList<Employee3> l) {
		l.add(new Employee3("Durga", 1000));
		l.add(new Employee3("Rajat", 2000));
		l.add(new Employee3("Ravi", 3000));
		l.add(new Employee3("Shiva", 4000));
	}
}
