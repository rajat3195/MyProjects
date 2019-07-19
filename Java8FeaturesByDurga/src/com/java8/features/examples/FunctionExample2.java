package com.java8.features.examples;

import java.util.function.Function;

public class FunctionExample2 {
	public static void main(String[] args) {
		Function<String, Integer> f = i -> i.length();
		System.out.println(f.apply("Predefined"));
		System.out.println(f.apply("functional"));
		System.out.println(f.apply("interface"));
		System.out.println(f.apply("durgasoftwaresolution"));
	}
}
