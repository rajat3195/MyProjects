package com.java8.features.examples;

import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
	}
}
