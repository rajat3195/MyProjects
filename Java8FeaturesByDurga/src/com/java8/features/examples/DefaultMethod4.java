package com.java8.features.examples;

interface Left {
	default void m1() {
		System.out.println("Left Inteface m1 method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right Inteface m1 method");
	}
}

public class DefaultMethod4 implements Left, Right {

	@Override
	public void m1() {
		// System.out.println("Our own m1() method");
		// Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		DefaultMethod4 dm = new DefaultMethod4();
		dm.m1();
	}

}
