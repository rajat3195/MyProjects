package com.java8.features.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	String name;
	int eno;
	int salary;

	public Employee(String name, int eno, int salary) {
		super();
		this.name = name;
		this.eno = eno;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return eno + ":" + name + ":" + salary;
	}

}

public class LembdaExp5Comparator {
	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("Durga", 564687, 10000000));
		l.add(new Employee("Sunny", 788412, 2500000));
		l.add(new Employee("Bunny", 912512, 3500000));
		l.add(new Employee("Hunny", 111574, 6500000));
		l.add(new Employee("Gunny", 664645, 8400000));
		System.out.println(l);

		// Comparator<Employee> c = (e1, e2) -> e1.eno - e2.eno;
		// Sort by eno
		System.out.println("Sort by eno");
		Comparator<Employee> c1 = (e1, e2) -> (e1.eno < e2.eno ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		Collections.sort(l, c1);
		System.out.println(l);

		// Sort by name
		System.out.println("Sort by name");
		Comparator<Employee> c2 = (e1, e2) -> (e1.name.compareTo(e2.name));
		Collections.sort(l, c2);
		System.out.println(l);

		// Find second highest salary
		Collections.sort(l, (e1, e2) -> e2.salary - e1.salary);
		System.out.println("Second highest salary : " + l.get(1).salary);

	}
}
