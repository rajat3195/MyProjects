package com.java8.features.examples;

import java.util.function.Consumer;

public class ConsumerExample1 {
	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Welcome in consumer example");
		c1.accept("Durga");
		c1.accept("Software");
	}
}
