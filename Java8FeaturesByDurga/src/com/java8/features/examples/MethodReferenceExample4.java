package com.java8.features.examples;

interface Interface2 {
	public void add(int i, int j);
}

public class MethodReferenceExample4 {

	public static void sum(int x, int y) {
		System.out.println("The sum:" + (x + y));
	}

	public static void main(String[] args) {
		Interface2 i1 = (a, b) -> System.out.println("The addition:" + (a + b));
		i1.add(10, 20);

		Interface2 i2 = MethodReferenceExample4::sum;
		i2.add(100, 200);
	}

}
