package com.java8.features.examples;

import java.util.function.IntPredicate;

public class IntPredicateExample {
	public static void main(String[] args) {
		IntPredicate p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		System.out.println(p.test(11));

		int x[] = { 0, 5, 10, 15, 20, 25, 30 };
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
