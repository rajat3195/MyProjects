package com.java8.features.examples;

class Sample2 {
	Sample2(String s) {
		System.out.println("Sample class Constructor Execution with argument:" + s);
	}
}

interface Interface4 {
	public Sample2 get(String s);
}

public class ConstructorReferenceExample2 {

	public static void main(String[] args) {
		Interface4 i = Sample2::new;
		Sample2 s1 = i.get("Durga");
		Sample2 s2 = i.get("kaushik");
		Sample2 s3 = i.get("Ganja");
		Sample2 s4 = i.get("Rajat");
	}

}
