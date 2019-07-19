package com.java8.features.examples;

public class MethodReferenceExample3 {

	private int m1() {
		for (int i = 1; i <= 10; i++)
			System.out.println("Child Thread - 1");
		return 10;
	}

	public static void main(String[] args) {
		MethodReferenceExample3 methodRef = new MethodReferenceExample3();
		Runnable runnable = methodRef::m1;
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 1; i <= 10; i++)
			System.out.println("Main Thread - 1");
	}

}
