package com.java8.features.examples;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		BiFunction<String, String, String> f1 = (s1, s2) -> s1 + s2;
		System.out.println("By using BiFunction : " + f1.apply("durga", "software"));

		BinaryOperator<String> f2 = (s1, s2) -> s1 + s2;
		System.out.println("By using BinaryOperator : " + f2.apply("durga", "software"));

		BinaryOperator<Integer> f3 = (s1, s2) -> s1 * s2;
		System.out.println("By using BinaryOperator : " + f3.apply(10, 20));

		IntBinaryOperator f4 = (s1, s2) -> s1 * s2;
		System.out.println("By using IntBinaryOperator : " + f4.applyAsInt(5, 100));

		DoubleBinaryOperator f5 = (s1, s2) -> s1 * s2;
		System.out.println("By using DoubleBinaryOperator : " + f5.applyAsDouble(5.2, 4.4));

		LongBinaryOperator f6 = (s1, s2) -> s1 * s2;
		System.out.println("By using LongBinaryOperator : " + f6.applyAsLong(1514, 152545));
	}
}
