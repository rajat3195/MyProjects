package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample9 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(25);
		System.out.println(l);
		Comparator<Integer> asc = (i1, i2) -> i1.compareTo(i2);
		Comparator<Integer> desc = (i1, i2) -> -i1.compareTo(i2);

		List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Asc Sorted List : " + sortedList);
		int min = sortedList.stream().min(asc).get();
		System.out.println("Min number : " + min);
		int max = sortedList.stream().max(asc).get();
		System.out.println("Max number : " + max);

		List<Integer> descSortedList = l.stream().sorted(desc).collect(Collectors.toList());
		System.out.println("Desc Sorted List : " + descSortedList);
		min = descSortedList.stream().min(desc).get();
		System.out.println("Min number : " + min);
		max = descSortedList.stream().max(desc).get();
		System.out.println("Max number : " + max);
	}
}
