package com.java8.features.examples;

import java.util.function.Function;

public class FunctionExample5 {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> 2 * i;
		Function<Integer, Integer> f2 = i -> i * i * i;

		// First f1 followed by f2
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.andThen(f2).apply(4));

		// First f2 and then f1
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f1.compose(f2).apply(4));

	}
}
