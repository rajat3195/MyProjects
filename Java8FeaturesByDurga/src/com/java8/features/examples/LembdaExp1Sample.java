package com.java8.features.examples;

interface InterF1 {
	public void m1();
}

//class Demo implements InterF {
//	public void m1() {
//		System.out.println("Hello...");
//	}
//}

public class LembdaExp1Sample {
	public static void main(String[] args) {
		// Old way to use
		// InterF i = new Demo();
		// i.m1();

		// New way by lambda expression
		InterF1 i = () -> System.out.println("Hello...");
		i.m1();
		i.m1();
	}
}
