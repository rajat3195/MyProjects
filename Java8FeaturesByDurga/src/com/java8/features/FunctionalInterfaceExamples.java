package com.java8.features;

public interface FunctionalInterfaceExamples {

}

interface InterA {
	void m1();

	void m2();

	static void m3() {
	}

	default void m4() {
	}
}

//If we will add @FunctionalInterface annotation, so that will be called as
//functional interface. we can't add more than one abstract method in FI
//because FI allows only one abstract method, but we can add multiple default
//and static methods.
@FunctionalInterface
interface Inter {
	void m1();

	// void m2();
	static void m3() {
	}

	default void m4() {
	}
}

@FunctionalInterface
interface Parent {
	void m1();
}

interface Child extends Parent {
}
// Q - Is child interface is FI?
// A - Yes, as it has only one SAM (Single Abstract Method) inherited from parent interface.

@FunctionalInterface
interface A {
	void m1();
}

@FunctionalInterface
interface B extends A {
	void m1();
}
//Q - B is FI?
//A - Yes valid FI, as override parent m1().
