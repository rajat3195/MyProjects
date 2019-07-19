package com.java8.features.examples;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println("By using Function : " + f1.apply(4));

		UnaryOperator<Integer> f2 = i -> i * i;
		System.out.println("By using UnaryOperator : " + f2.apply(4));

		IntUnaryOperator f3 = i -> i * i;
		System.out.println("By using IntUnaryOperator : " + f3.applyAsInt(4));

		IntUnaryOperator f4 = i -> i + 1;
		System.out.println(f4.applyAsInt(5));

		IntUnaryOperator f5 = i -> i * i;
		System.out.println(f5.applyAsInt(5));

		System.out.println(f4.andThen(f5).applyAsInt(5));
	}
}
