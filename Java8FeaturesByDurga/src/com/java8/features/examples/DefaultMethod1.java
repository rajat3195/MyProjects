package com.java8.features.examples;

interface I {
	public void m1();

	public void m2();

	default void m3() {
		System.out.println("Default Method");
	}
}

class Test1 implements I {
	public void m1() {
		System.out.println("Test1's m1 Method");
	}

	public void m2() {
		System.out.println("Test1's m2 Method");
	}

	public void m3() {
		System.out.println("Overriding version of Default Method m3 in Test1");
	}
}

class Test2 implements I {
	public void m1() {
		System.out.println("Test2's m1 Method");
	}

	public void m2() {
		System.out.println("Test2's m2 Method");
	}

	public void m3() {
		System.out.println("Overriding version of Default Method m3 in Test2");
	}
}

class Test100 implements I {
	public void m1() {
		System.out.println("Test100's m1 Method");
	}

	public void m2() {
		System.out.println("Test100's m2 Method");
	}

	public void m3() {
		System.out.println("Overriding version of Default Method m3 in Test100");
	}
}

public class DefaultMethod1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		t1.m2();
		t1.m3();

		Test2 t2 = new Test2();
		t2.m1();
		t2.m2();
		t2.m3();

		Test100 t100 = new Test100();
		t100.m1();
		t100.m2();
		t100.m3();
	}

}
