package com.java8.features.examples;

interface Inter {
	default void m1() {
		System.out.println("Default Method");
	}

	// A default method cannot override a method from java.lang.Object
	// default int hashCode() {
	// return 10;
	// }
}

public class DefaultMethod3 implements Interface {

	public void m1() {
		System.out.println("Overriding version of Default Method");
	}

	public static void main(String[] args) {
		DefaultMethod3 dm = new DefaultMethod3();
		dm.m1();
	}

}
