package com.java8.features.examples;

import java.util.function.IntFunction;

public class IntFunctionExample {
	public static void main(String[] args) {
		IntFunction<Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
	}
}
