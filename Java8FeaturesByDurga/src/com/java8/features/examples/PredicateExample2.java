package com.java8.features.examples;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 5;
		String[] s = { "Nag", "chiranjeevi", "Venkatesth", "Balaiah", "Sunny", "Katrina" };
		for (String s1 : s) {
			if (p.test(s1))
				System.out.println(s1);
		}

		System.out.println(p.test("Rajat"));
		System.out.println(p.test("Shayam"));

	}
}
