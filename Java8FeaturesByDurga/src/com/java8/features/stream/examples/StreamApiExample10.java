package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiExample10 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(25);
		System.out.println(l);
		Consumer<Integer> c = i -> {
			System.out.println("The squere of " + i + " is : " + (i * i));
		};
		l.stream().forEach(c);
	}
}
