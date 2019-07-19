package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	void streamApiFunctions() {

		// stream()
		// filter(Predicate)
		// map(Function)
		// collect()
		// count()
		// sorted() Asc
		// sorted(Comparator) Desc
		// min(Comparator)
		// max(Comparator)
		// forEach(Consumer)
		// toArray
		// Stream.of(T... values)
		

	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println("Numbers list : " + l);

		// filter:
		// input-->10
		// output-->0 to 10 or <=10
		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);

		// map:
		// input-->10
		// output-->10
		List<Integer> l2 = l.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(l2);

	}

}
