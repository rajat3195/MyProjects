package com.java8.features.examples;

interface InterF2 {
	public void add(int i, int j);
}

public class LembdaExp2Add {
	public static void main(String[] args) {
		// Using lambda expression
		InterF2 i = (a, b) -> System.out.println("Sum of two number is : " + (a + b));
		i.add(10, 20);
		i.add(100, 200);
		i.add(1000, 2000);
	}
}
