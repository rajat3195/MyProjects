package com.java8.features.examples;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionApiExample {
	public static void main(String[] args) {
		Function<String, Integer> f1 = i -> i.length();
		System.out.println("By using Function : " + f1.apply("durga"));

		ToIntFunction<String> f2 = i -> i.length();
		System.out.println("By using ToIntFunction : " + f2.applyAsInt("durga"));

		Function<Integer, Double> f3 = i -> Math.sqrt(i);
		System.out.println(f3.apply(7));

		IntToDoubleFunction f4 = i -> Math.sqrt(i);
		System.out.println(f4.applyAsDouble(9));

	}
}
