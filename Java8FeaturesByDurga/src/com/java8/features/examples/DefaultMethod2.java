package com.java8.features.examples;

interface Interface {
	default void m1() {
		System.out.println("Default Method");
	}
}

public class DefaultMethod2 implements Interface {

	public void m1() {
		System.out.println("Overriding version of Default Method");
	}

	public static void main(String[] args) {
		DefaultMethod2 dm = new DefaultMethod2();
		dm.m1();
	}

}
