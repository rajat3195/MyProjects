package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample1 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println("Numbers list : " + l);
		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers list : " + l1);
	}
}
