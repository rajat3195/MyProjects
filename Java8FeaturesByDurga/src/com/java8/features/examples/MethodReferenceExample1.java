package com.java8.features.examples;

public class MethodReferenceExample1 {

	public static void m1() {
		for (int i = 1; i <= 10; i++)
			System.out.println("Child Thread - 1");
	}

	public static void main(String[] args) {
		Runnable runnable = MethodReferenceExample1::m1;
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 1; i <= 10; i++)
			System.out.println("Main Thread - 1");
	}

}
