package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample7 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Sunny Loene");
		l.add("Deepika Padukon");
		l.add("Kajal Agarwal");
		l.add("Prabhas");
		l.add("Anushka Shetty");
		l.add("Alia Bhatt");
		System.out.println(l);
		Comparator<String> c = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return 1;
			else
				return s1.compareTo(s2);
		};

		List<String> sortedList = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sorted List : " + sortedList);


	}
}
