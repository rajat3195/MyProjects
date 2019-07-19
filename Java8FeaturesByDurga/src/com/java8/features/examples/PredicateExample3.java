package com.java8.features.examples;

import java.util.function.Predicate;

class Emp {
	private String name;
	private int salary;
	private boolean ishavingGf;

	public Emp(String name, int salary, boolean ishavingGf) {
		super();
		this.name = name;
		this.salary = salary;
		this.ishavingGf = ishavingGf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isIshavingGf() {
		return ishavingGf;
	}

	public void setIshavingGf(boolean ishavingGf) {
		this.ishavingGf = ishavingGf;
	}

}

public class PredicateExample3 {
	public static void main(String[] args) {
		Predicate<Emp> p = e -> e.getSalary() > 100000 && e.isIshavingGf() == true;
		System.out.println(p.test(new Emp("Ram", 200000, true)));
		System.out.println(p.test(new Emp("Shayam", 150000, false)));
	}
}
