package com.java8.features.examples;

interface Interface1 {
	public static void main(String[] args) {
		System.out.println("Interface Static Main Method : " + args[0]);
	}
}

public class StaticMethodExample2 implements Interface1 {
	public static void main(String[] args) {
		Interface1.main(new String[] { "main" });
	}
}
