package com.java8.features.examples;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employees {
	String name;
	double salary;

	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class PredicateExample4 {
	public static void main(String[] args) {

		ArrayList<Employees> l = new ArrayList<>();
		l.add(new Employees("Durga", 1000));
		l.add(new Employees("Ravi", 2000));
		l.add(new Employees("Shiva", 3000));
		l.add(new Employees("Mahesh", 4000));
		l.add(new Employees("Adarsh", 5000));
		l.add(new Employees("sagar", 6000));

		Predicate<Employees> p = e -> e.salary > 3000;
		for (Employees e : l) {
			if (p.test(e))
				System.out.println(e.name + " : " + e.salary);
		}

	}
}
