package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample5 {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Asc Sorted List : " + sortedList);

		List<Integer> descSortedList = marks.stream().sorted((i1, i2) -> (i1 < i2 ? 1 : (i1 > i2 ? -1 : 0)))
				.collect(Collectors.toList());
		System.out.println("Desc Sorted List with Comparator : " + descSortedList);

		descSortedList = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Desc Sorted List with -i1.compareTo(i2) : " + descSortedList);

		// multiple ways to sort by asc
		// .sorted()
		// .sorted((i1, i2) -> i1.compareTo(i2))
		// .sorted((i1, i2) -> (i2 < i1 ? 1 : (i2 > i1 ? -1 : 0)))

		// multiple ways to sort by desc
		// .sorted((i1, i2) -> -i1.compareTo(i2))
		// .sorted((i1, i2) -> i2.compareTo(i1))
		// .sorted((i1, i2) -> (i1 < i2 ? 1 : (i1 > i2 ? -1 : 0)))

	}
}
