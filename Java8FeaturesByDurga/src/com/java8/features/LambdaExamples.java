package com.java8.features;

public class LambdaExamples {

	// First example
	public void helloWorld() {
		System.out.println("Hello World...");
	}
	// ()->{System.out.println("Hello...");}
	// ()->System.out.println("Hello...");

	// Second example
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	// (a,b)->System.out.println(a+b);

	// Third example
	public int square(int n) {
		return n * n;
	}
	// (n)->{return n*n;}
	// (n)-> n*n;
	// n -> n*n;

	// Fourth example
	public int getLength(String s) {
		return s.length();
	}
	// (s)->{return s.length();}
	// (s)-> s.length();
	// s-> s.length();

}
