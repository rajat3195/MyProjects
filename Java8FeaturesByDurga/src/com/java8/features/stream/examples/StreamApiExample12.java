package com.java8.features.stream.examples;

import java.util.stream.Stream;

public class StreamApiExample12 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(System.out::println);

		Integer[] i = { 10, 20, 30, 40, 50 };
		Stream.of(i).forEach(System.out::println);
	}
}
