package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample6 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Sunny Loene");
		l.add("Deepika Padukon");
		l.add("Kajal Agarwal");
		l.add("Prabhas");
		l.add("Anushka Shetty");
		l.add("Alia Bhatt");

		System.out.println(l);
		List<String> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Asc Sorted List : " + sortedList);

		List<String> descSortedList = l.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Desc Sorted List : " + descSortedList);

	}
}
