package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample3 {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(10);
		marks.add(20);
		marks.add(5);
		marks.add(15);
		marks.add(25);
		System.out.println("Normal list : " + marks);
		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("Incresed  list : " + updatedMarks);
	}
}
