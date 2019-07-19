package com.java8.features.examples;

public class MethodReferenceExample2 {

	public void m1() {
		for (int i = 1; i <= 10; i++)
			System.out.println("Child Thread - 1");
	}

	public static void main(String[] args) {
		MethodReferenceExample2 methodRef = new MethodReferenceExample2();
		Runnable runnable = methodRef::m1;
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 1; i <= 10; i++)
			System.out.println("Main Thread - 1");
	}

}
