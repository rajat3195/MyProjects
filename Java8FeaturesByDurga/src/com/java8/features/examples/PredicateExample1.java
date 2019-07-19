package com.java8.features.examples;

import java.util.function.Predicate;

//Predicate<T>
//public void boolean test(Integer I) {
//	if(I%2==0)
//		true;
//	else
//		false;
//}

public class PredicateExample1 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		System.out.println(p.test(11));
	}
}
