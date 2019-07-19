package com.java8.features.examples;

interface InterF {
	public static void m1() {
		System.out.println("Interface Static Method");
	}
}

public class StaticMethodExample1 implements InterF {
	public static void main(String[] args) {
		InterF.m1();// 1 - valid

		// implementation class won't get interface static method automatically.
		// compulsory we have to call explicitly.

		// bwlow is invalid call for static method
		// m1();// 2
		// StaticMethodExample.m1();// 3
		// StaticMethodExample sme = new StaticMethodExample();
		// sme.m1();// 4

	}

}
