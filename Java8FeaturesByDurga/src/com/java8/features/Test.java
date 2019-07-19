package com.java8.features;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static int squareIt(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		System.out.println("Old way by using normal function");
		System.out.println("The square of 4:" + squareIt(4));
		System.out.println("The square of 5:" + squareIt(5));

		System.out.println("New way by using lambda expression");
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("The square of 40:" + f.apply(40));
		System.out.println("The square of 50:" + f.apply(50));

		System.out.println("Checking Numbers even or not");
		Predicate<Integer> p = i -> i % 2 == 0;
		String value = null;
		value = p.test(4) ? "even" : "odd";
		System.out.println("4 is " + value);
		value = p.test(5) ? "even" : "odd";
		System.out.println("5 is " + value);

	}

}
