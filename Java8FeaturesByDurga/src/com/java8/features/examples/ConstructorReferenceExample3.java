package com.java8.features.examples;

class Sample3 {
	Sample3() {
		System.out.println("No Arguments");
	}

	Sample3(String s) {
		System.out.println("String Arguments:" + s);
	}
}

interface Interface5 {
	public Sample3 get(String s);
}

public class ConstructorReferenceExample3 {

	public static void main(String[] args) {
		Interface5 i = Sample3::new;
		Sample3 s1 = i.get("Durga");
		Sample3 s2 = i.get("kaushik");
	}

}
