package com.java8.features.examples;

import java.util.function.Function;

public class FunctionExample3 {
	public static void main(String[] args) {
		Function<String, String> f = i -> i.toUpperCase();
		System.out.println(f.apply("Predefined"));
		System.out.println(f.apply("functional"));
		System.out.println(f.apply("interface"));
		System.out.println(f.apply("durgasoftwaresolution"));
	}
}
