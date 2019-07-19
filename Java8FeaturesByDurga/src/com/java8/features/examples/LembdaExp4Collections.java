package com.java8.features.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MyComparator implements Comparator<Integer> {
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o1 - o2;
//	}
//}

public class LembdaExp4Collections {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println(l);

		// Old way
		// Collections.sort(l, new MyComparator());
		// System.out.println(l);

		// New way
		Comparator<Integer> com = (a, b) -> a - b;
		Collections.sort(l, com);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);

	}
}
