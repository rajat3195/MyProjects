package com.java8.features.examples;

import java.util.function.Predicate;

public class PredicateExample5 {
	public static void main(String[] args) {

		int[] x = { 0, 5, 10, 15, 20, 25, 30, 35 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		// and(), or(), negate()
		System.out.println("The numbers which are even and > 10 are: ");
		for (int x1 : x) {
			if (p1.and(p2).test(x1))
				System.out.println(x1);
		}

		System.out.println("The numbers which are even or > 10 are: ");
		for (int x1 : x) {
			if (p1.or(p2).test(x1))
				System.out.println(x1);
		}

		System.out.println("The numbers which are even : ");
		for (int x1 : x) {
			if (p1.test(x1))
				System.out.println(x1);
		}

		System.out.println("The numbers which are not even : ");
		for (int x1 : x) {
			if (p1.negate().test(x1))
				System.out.println(x1);
		}

	}
}
