package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println("Numbers list : " + l);
		List<Integer> l1 = l.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("Numbers list which is multiplied by two : " + l1);
	}
}
