package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample11 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(25);
		Integer[] intArr = l.stream().toArray((Integer[]::new));
		System.out.println("Printing by for each loop");
		for (Integer i : intArr) {
			System.out.print(i + ",");
		}

		System.out.println("\nPrinting by forEach method");
		Stream.of(intArr).forEach(System.out::println);
	}
}
